package laba7;

import java.io.*;
import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputFileName = "src/laba7/input.txt";
        String outputFileName = "src/laba7/output.txt";

        System.out.println("Введите данные для записи во входной файл (для завершения введите 'конец'):");

        try (PrintWriter inputWriter = new PrintWriter(new FileWriter(inputFileName))) {
            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase("конец")) {
                    break;
                }
                inputWriter.println(line);
            }
            System.out.println("Данные успешно записаны во входной файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи во входной файл: " + e.getMessage());
            scanner.close();
            return;
        }

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
                PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные преобразованы и записаны в файл: " + outputFileName);

            System.out.println("Содержимое выходного файла (преобразованное в верхний регистр):");
            try (BufferedReader resultReader = new BufferedReader(new FileReader(outputFileName))) {
                while ((line = resultReader.readLine()) != null) {
                    printWriter.println(line.toUpperCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }

        System.out.println("Хотите удалить созданные файлы? (да/нет):");
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
