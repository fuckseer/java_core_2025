package timus;

import java.util.Scanner;


public class task1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String position = scanner.nextLine();
            int attacks = countKnightAttacks(position);
            System.out.println(attacks);
        }

        scanner.close();
    }

    private static int countKnightAttacks(String position) {
        char column = position.charAt(0);
        int row = Character.getNumericValue(position.charAt(1));

        int[][] moves = {
                {2, 1}, {2, -1},
                {-2, 1}, {-2, -1},
                {1, 2}, {1, -2},
                {-1, 2}, {-1, -2}
        };

        int count = 0;
        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = (column - 'a' + 1) + move[1];

            if (newRow >= 1 && newRow <= 8 && newCol >= 1 && newCol <= 8) {
                count++;
            }
        }

        return count;
    }
}
