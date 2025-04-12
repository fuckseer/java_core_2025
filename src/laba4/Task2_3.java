package laba4;
import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("количество элементов ");
        byte n = scanner.nextByte();

        byte[] array = new byte[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextByte();
        }

        byte sum = 0;
        for (byte num : array) {
            sum += num;
        }

        System.out.println("Сумма элементов: " + sum);
    }
}
