package timus;
import java.util.Scanner;
import java.util.Arrays;

public class task1203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] talks = new int[N][2];

        for (int i = 0; i < N; i++) {
            talks[i][0] = scanner.nextInt();
            talks[i][1] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(talks, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int count = 0;
        int lastEndTime = -1;

        for (int[] talk : talks) {
            if (talk[0] >= lastEndTime + 1) {
                count++;
                lastEndTime = talk[1];
            }
        }

        System.out.println(count);
            }
        }