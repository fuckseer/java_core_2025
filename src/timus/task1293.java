package timus;
import java.util.Scanner;

public class task1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int square = A * B;

        int whole_square = N * square * 2;

        long whole_weight = (long) whole_square;

        System.out.println(whole_weight);

        scanner.close();
    }
}