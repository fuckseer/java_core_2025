package timus;

import java.util.Scanner;

public class task1910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] magicFields = new int[n];

        for (int i = 0; i < n; i++) {
            magicFields[i] = scanner.nextInt();
        }

        scanner.close();

        int maxSum = 0;
        int middleIndex = 0;

        for (int i = 0; i <= n - 3; i++) {
            int currentSum = magicFields[i] + magicFields[i + 1] + magicFields[i + 2];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                middleIndex = i + 2;
            }
        }

        System.out.println(maxSum + " " + middleIndex);
    }
}
