package laba2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        Random random = new Random();
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(200);
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        List<Integer> minIndices = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                minIndices.add(i);
            }
        }

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.print("Индексы элементов с минимальным значением: ");
        for (int index : minIndices) {
            System.out.print(index + " ");
        }
    }
}