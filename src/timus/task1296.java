package timus;

import java.util.Scanner;


public class task1296 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long maxSum = 0;
        long currentSum = 0;

        for (int i = 0; i < N; i++) {
            int p = scanner.nextInt();
            currentSum += p;
            if (currentSum < 0) {
                currentSum = 0;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        scanner.close();

        System.out.println(maxSum);
    }
}