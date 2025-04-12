package timus;
import java.util.Scanner;

public class task1991 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long unusedBoomBooms = 0;
        long survivingDroids = 0;

        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();

            if (ai > k) {
                unusedBoomBooms += (ai - k);
            } else {
                survivingDroids += (k - ai);
            }
        }

        scanner.close();

        System.out.println(unusedBoomBooms + " " + survivingDroids);
    }
}

