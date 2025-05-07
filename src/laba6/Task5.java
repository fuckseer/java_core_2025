package laba6;

import java.util.Scanner;

public class Task5 {

    private static final int NUM_THREADS = 8;

    public static void main(String[] args) {
        int[] array = readArrayFromKeyboard();

        int threadsToUse = Math.min(NUM_THREADS, array.length);

        int[] localMaxima = new int[threadsToUse];

        int chunkSize = array.length / threadsToUse;
        int remaining = array.length % threadsToUse;

        Thread[] threads = new Thread[threadsToUse];
        int start = 0;

        for (int i = 0; i < threadsToUse; i++) {
            int end = start + chunkSize;
            if (i < remaining) {
                end += 1;
            }

            int[] subArray = new int[end - start];
            System.arraycopy(array, start, subArray, 0, end - start);
            start = end;

            final int index = i;

            threads[i] = new Thread(() -> {
                int max = findMax(subArray);
                localMaxima[index] = max;
                System.out.println("поток " + (index + 1) + " нашел локальный максимум " + max);
            });

            threads[i].start();
        }

        for (int i = 0; i < threadsToUse; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("поток прерван: " + e.getMessage());
            }
        }

        int globalMax = findMax(localMaxima);
        System.out.println("глобальный максимум " + globalMax);
    }

    private static int[] readArrayFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("количество элементов в массиве");
        int n;
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print(e);
            }
        }

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    array[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
            }
        }

        return array;
    }
    private static int findMax(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
