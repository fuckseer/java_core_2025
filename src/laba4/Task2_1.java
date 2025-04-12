package laba4;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("количество элементов массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        double average =  sum / count;
        System.out.println("cреднее значение положительных элементов: " + average);
    }
}

