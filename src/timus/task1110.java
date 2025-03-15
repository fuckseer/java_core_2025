package timus;

import java.util.Scanner;

import java.util.ArrayList;

public class task1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = scanner.nextInt();

        ArrayList<Integer> result = new ArrayList<>();

        for (int X = 0; X < M; X++) {
            int modValue = (int) (Math.pow(X, N) % M);
            if (modValue == Y) {
                result.add(X);
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }

        scanner.close();
    }
}