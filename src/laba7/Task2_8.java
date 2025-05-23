package laba7;

import java.io.*;
import java.util.Scanner;

public class Task2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFileName = "src/laba7/input.txt";

        System.out.println("Введите данные для записи в файл (для завершения введите 'конец'):");

        try (PrintWriter writer = new PrintWriter(new FileWriter(inputFileName))) {
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

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(inputFileName));
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            reader.close();
            System.out.println("Количество строк в файле: " + lineCount);

            System.out.println("Содержимое файла:");
            BufferedReader contentReader = new BufferedReader(
                    new FileReader(inputFileName));
            String line;
            while ((line = contentReader.readLine()) != null) {
                System.out.println(line);
            }
            contentReader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        System.out.println("Хотите удалить файл? (да/нет):");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            File file = new File(inputFileName);
            if (file.delete()) {
                System.out.println("Файл удален: " + inputFileName);
            } else {
                System.out.println("Не удалось удалить файл: " + inputFileName);
            }
        } else {
            System.out.println("Файл сохранен.");
        }

        scanner.close();
    }
}
