package laba4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_1_fixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        try {
            System.out.print("введите количество элементов массива: ");
            n = scanner.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Количество элементов должно быть положительным");
            }
        } catch (InputMismatchException e) {
            System.out.println("ошибка: введено не целое число.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("ошибка: " + e);
            return;
        }

        int[] array = new int[n];
        System.out.println("введите элементы массива:");

        for (int i = 0; i < n; i++) {
            try {
                array[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено не целое число. Повторите ввод " + (i + 1));
                scanner.next();
                i--;
            }
        }

        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        try {
            if (count == 0) {
                throw new ArithmeticException("положительные элементы отсутствуют");
            }
            double average = sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
