package timus;

import java.util.Scanner;

public class task1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int k = N / 2;
        int maxSum = 9 * k;
        long[] ways = new long[maxSum + 1];
        ways[0] = 1;

        for (int i = 0; i < k; i++) {
            long[] newWays = new long[maxSum + 1];
            for (int s = 0; s <= maxSum; s++) {
                if (ways[s] == 0) continue;
                for (int d = 0; d <= 9; d++) {
                    if (s + d > maxSum) break;
                    newWays[s + d] += ways[s];
                }
            }
            ways = newWays;
        }

        long total = 0;
        for (int s = 0; s <= maxSum; s++) {
            total += ways[s] * ways[s];
        }

        System.out.println(total);
    }
}