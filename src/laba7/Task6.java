package laba7;

import java.io.*;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя файла:");
        String fileName = scanner.nextLine();

        System.out.println("Введите слово для поиска:");
        String searchWord = scanner.nextLine().toLowerCase();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nРезультаты поиска:");
            int lineNumber = 0;
            int matchCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lineNumber++;

                if (line.toLowerCase().contains(searchWord)) {
                    System.out.println("Строка " + lineNumber + ": " + line);
                    matchCount++;
                }
            }

            if (matchCount == 0) {
                System.out.println("Слово \"" + searchWord + "\" не найдено в файле.");
            } else {
                System.out.println("\nНайдено совпадений: " + matchCount);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден. Проверьте правильность имени файла и пути к нему.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
