package timus;

import java.util.Scanner;

public class task1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        int k = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);

        String[] secondLine = scanner.nextLine().split(" ");
        int[] arrivals = new int[n];
        for (int i = 0; i < n; i++) {
            arrivals[i] = Integer.parseInt(secondLine[i]);
        }

        scanner.close();

        int carsInQueue = 0;

        for (int i = 0; i < n; i++) {
            carsInQueue += arrivals[i];

            int carsTurned = Math.min(carsInQueue, k);
            carsInQueue -= carsTurned;
        }

        System.out.println(carsInQueue);
    }
}
