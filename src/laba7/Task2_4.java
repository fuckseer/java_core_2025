package laba7;

import java.io.*;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = "example_file.txt";

        System.out.println("Введите данные для записи в файл:");
        String data = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        System.out.println("Хотите удалить файл? (да/нет):");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            if (new File(fileName).delete()) {
                System.out.println("Файл удален: " + fileName);
            } else {
                System.out.println("Не удалось удалить файл: " + fileName);
            }
        } else {
            System.out.println("Файл сохранен.");
        }

        scanner.close();
    }
}