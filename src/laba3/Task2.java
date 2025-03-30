package laba3;

import java.util.Scanner;

public class Task2 {

    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return toBinary(n / 2) + (n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Введите целое число (>= 0): ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("введите неотрицательное число.");
                }
            } else {
                System.out.println("Неверный ввод. Введите целое число.");
                scanner.next();
            }
        }

        scanner.close();

        if (number == 0) {
            System.out.println("Двоичное представление: 0");
        } else {
            String binary = toBinary(number);
            System.out.println("Двоичное представление числа " + number + " : " + binary);
        }
    }
}
