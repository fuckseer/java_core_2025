package laba7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File folder = new File("example_folder");
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
            }
        } else {
            System.out.println("Папка уже существует: " + folder.getAbsolutePath());
        }

        File file = new File(folder.getAbsolutePath() + File.separator + "example_file.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать файл: " + file.getAbsolutePath());
            }

            System.out.println("Введите данные для записи в файл (для завершения введите 'конец'):");
            try (FileWriter writer = new FileWriter(file)) {
                String line;
                while (true) {
                    line = scanner.nextLine();
                    if (line.equalsIgnoreCase("конец")) {
                        break;
                    }
                    writer.write(line + System.lineSeparator());
                }
                System.out.println("Данные успешно записаны в файл.");
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }

            System.out.println("Хотите удалить файл и папку? (да/нет):");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("да")) {
                // Удаление файла и папки
                if (file.delete()) {
                    System.out.println("Файл удален: " + file.getAbsolutePath());
                } else {
                    System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
                }

                if (folder.delete()) {
                    System.out.println("Папка удалена: " + folder.getAbsolutePath());
                } else {
                    System.out.println("Не удалось удалить папку: " + folder.getAbsolutePath());
                }
            } else {
                System.out.println("Файл и папка сохранены.");
            }

        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
