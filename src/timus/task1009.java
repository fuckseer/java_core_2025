package timus;

import java.util.Scanner;

public class task1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        scanner.close();
        long[][] dp = new long[N + 1][2];

        dp[1][0] = 1;
        dp[1][1] = K - 1;

        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i-1][1];

            dp[i][1] = dp[i-1][0] * (K - 1) + dp[i-1][1] * (K - 1);
        }

        long result = 0;

        if (N == 1) {
            result = K - 1;
        } else {
            result = (K - 1) * (dp[N-1][0] + dp[N-1][1]);
        }

        System.out.println(result);
    }
}
