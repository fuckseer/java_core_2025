package laba7;

import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к существующему файлу или создайте новый файл");
        System.out.println("1 - Создать новый файл");
        System.out.println("2 - Использовать существующий файл");

        String choice = scanner.nextLine();
        String filePath;

        if (choice.equals("1")) {
            System.out.println("Введите имя нового файла:");
            filePath = scanner.nextLine();

            System.out.println("Введите содержимое файла (для завершения введите 'конец'):");
            try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                String line;
                while (true) {
                    line = scanner.nextLine();
                    if (line.equalsIgnoreCase("конец")) {
                        break;
                    }
                    writer.println(line);
                }
                System.out.println("Данные успешно записаны в файл.");
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
                scanner.close();
                return;
            }
        } else {
            System.out.println("Введите путь к существующему файлу:");
            filePath = scanner.nextLine();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            reader.close();

            System.out.println("Количество строк в файле: " + lineCount);

            // Показать содержимое файла
            System.out.println("Содержимое файла:");
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        scanner.close();
    }
}
