package laba7;

import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sourceFileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(sourceFileName)) {
            System.out.println("Введите содержимое файла (для завершения введите 'конец'):");
            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase("конец")) {
                    break;
                }
                writer.write(line + "\n");
                }
            System.out.println("Исходный файл создан.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
            scanner.close();
            }

        System.out.println("Введите имя файла назначения:");
        String destFileName = scanner.nextLine();

        try {
            FileReader reader = new FileReader(sourceFileName);
            FileWriter writer = new FileWriter(destFileName);

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println("Файл успешно скопирован!");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }

        scanner.close();
    }
}
