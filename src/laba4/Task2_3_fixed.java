package laba4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_3_fixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n;

        while (true) {
            try {
                System.out.print("количество элементов");
                n = scanner.nextByte();
                if (n <= 0) {
                    throw new IllegalArgumentException("количество элементов должно быть положительным");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("необходимо ввести целое число от 1 до 127");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e);
            }
        }

        byte[] array = new byte[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    array[i] = scanner.nextByte();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: необходимо ввести целое число от -128 до 127");
                    scanner.next();
                }
            }
        }

        int sum = 0;
        boolean overflow = false;

        for (byte num : array) {
            sum += num;
            if (sum > Byte.MAX_VALUE || sum < Byte.MIN_VALUE) {
                overflow = true;
                break;
            }
        }

        if (overflow) {
            System.out.println("сумма элементов выходит за пределы диапазона типа byte");
        } else {
            System.out.println("сумма элементов массива: " + (byte) sum);
        }
    }
}
