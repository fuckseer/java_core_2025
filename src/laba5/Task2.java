package laba5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static int[] getEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.print("введите количество элементов массива: ");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = scanner.nextInt();
        }

        int[] even = getEvenNumbers(original);
        System.out.println("четные числа: " + Arrays.toString(even));
    }
}
