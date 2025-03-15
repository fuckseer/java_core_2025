package timus;
import java.util.Scanner;

public class task1209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfQueries = scanner.nextInt();
        int[] positions = new int[numberOfQueries];
        for (int i = 0; i < numberOfQueries; i++) {
            positions[i] = scanner.nextInt();
        }

        StringBuilder sequence = new StringBuilder(); // пришлось прибегнуть к StringBuilder))
        int power = 0;
        int maxPosition = 0;

        for (int pos : positions) {
            if (pos > maxPosition) {
                maxPosition = pos;
            }
        }

        while (sequence.length() < maxPosition) {
            sequence.append((int) Math.pow(10, power));
            power++;
        }

        for (int pos : positions) {
            System.out.print(sequence.charAt(pos - 1) + " ");
        }
    }
}
