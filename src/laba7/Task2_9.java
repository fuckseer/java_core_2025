package laba7;

import java.io.*;
import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputFileName = "src/laba7/input.txt";
        String outputFileName = "src/laba7/output.txt";

        System.out.println("Введите данные для записи во входной файл (для завершения введите 'конец'):");

        try (FileWriter inputWriter = new FileWriter(inputFileName)) {
            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase("конец")) {
                    break;
                }
                inputWriter.write(line + System.lineSeparator());
            }
            System.out.println("Данные успешно записаны во входной файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи во входной файл: " + e.getMessage());
            scanner.close();
            return;
        }

        try {
            FileReader reader = new FileReader(inputFileName);
            FileWriter writer = new FileWriter(outputFileName);
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            reader.close();
            writer.close();
            System.out.println("Файл скопирован успешно!");

            System.out.println("Содержимое входного файла:");
            BufferedReader inputReader = new BufferedReader(new FileReader(inputFileName));
            String line;
            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }
            inputReader.close();

            System.out.println("\nСодержимое выходного файла (копия):");
            BufferedReader outputReader = new BufferedReader(new FileReader(outputFileName));
            while ((line = outputReader.readLine()) != null) {
                System.out.println(line);
            }
            outputReader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }

        System.out.println("\nХотите удалить созданные файлы? (да/нет):");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            File inputFile = new File(inputFileName);
            File outputFile = new File(outputFileName);

            if (inputFile.delete()) {
                System.out.println("Входной файл удален: " + inputFileName);
            } else {
                System.out.println("Не удалось удалить входной файл: " + inputFileName);
            }

            if (outputFile.delete()) {
                System.out.println("Выходной файл удален: " + outputFileName);
            } else {
                System.out.println("Не удалось удалить выходной файл: " + outputFileName);
            }
        } else {
            System.out.println("Файлы сохранены.");
        }

        scanner.close();
    }
}