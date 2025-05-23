package laba7;

import java.io.*;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите название файла:");
            String fileName = scanner.nextLine();

            System.out.println("Введите текст для записи в файл (для завершения введите 'конец' на отдельной строке):");
            StringBuilder text = new StringBuilder();
            String line;

            while (!(line = scanner.nextLine()).equals("конец")) {
                text.append(line).append("\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(fileName))) {
                writer.write(text.toString());

                int charCount = text.length();
                System.out.println("Текст успешно записан в файл");
                System.out.println("Количество записанных символов: " + charCount);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
