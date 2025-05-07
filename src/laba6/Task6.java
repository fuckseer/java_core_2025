package laba6;

import java.util.Scanner;

public class Task6 {

    private static final int NUM_THREADS = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long totalSum = parallelSum(array, NUM_THREADS);
        System.out.println("Общая сумма " + totalSum);
    }

    public static long parallelSum(int[] array, int numThreads) {
        numThreads = Math.min(numThreads, array.length);
        long[] partialSums = new long[numThreads];

        int chunkSize = array.length / numThreads;
        int remainder = array.length % numThreads;

        Thread[] threads = new Thread[numThreads];
        int start = 0;

        for (int i = 0; i < numThreads; i++) {
            int end = start + chunkSize;
            if (i < remainder) {
                end += 1;
            }
            int[] subArray = new int[end - start];
            System.arraycopy(array, start, subArray, 0, end - start);
            start = end;

            final int index = i;

            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int num : subArray) {
                    sum += num;
                }
                partialSums[index] = sum;
                System.out.println("поток " + (index + 1) + " нашел частичную сумму: " + sum);
            });

            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Поток прерван");
            }
        }

        long total = 0;
        for (long sum : partialSums) {
            total += sum;
        }

        return total;
    }
}
