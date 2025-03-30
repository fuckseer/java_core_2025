package laba3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("размер массива: ");
        int size = readInt(scanner);
        int[] array = new int[size];
        System.out.println("введите " + size + " целых чисел:");
        inputArray(scanner, array, 0);

        System.out.println("полученный массив:");
        outputArray(array, 0);

        scanner.close();
    }

    private static int readInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.print("Неверный ввод. введите целое число: ");
                scanner.next();
            }
        }
    }

    private static void inputArray(Scanner scanner, int[] array, int index) {
        if (index == array.length) {
            return;
        }

        System.out.print("элемент " + (index + 1) + ": ");
        array[index] = readInt(scanner);

        inputArray(scanner, array, index + 1);
    }

    private static void outputArray(int[] array, int index) {
        if (index == array.length) {
            System.out.println();
            return;
        }

        System.out.print(array[index] + " ");
        outputArray(array, index + 1);
    }
}