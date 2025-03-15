package laba2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String inputText = scanner.nextLine();

        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();

        String encryptedText = encrypt(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.print("Выполнить обратное преобразование? (y/n): ");
        char choice = scanner.next().charAt(0);

        if (choice == 'y') {
            String decryptedText = encrypt(encryptedText, -key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (choice == 'n') {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
    }

    private static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + key) % 26 + base);
            }
            result.append(c);
        }

        return result.toString();
    }
}