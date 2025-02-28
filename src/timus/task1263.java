package timus;
import java.util.Scanner;

public class task1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] voteCounts = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int candidate = scanner.nextInt();
            if (candidate >= 1 && candidate <= N) {
                voteCounts[candidate]++;
            }
        }

        scanner.close();

        for (int i = 1; i <= N; i++) {
            double percentage = ((double) voteCounts[i] / M) * 100;
            System.out.printf("%.2f%n", percentage);
                }
            }
        }