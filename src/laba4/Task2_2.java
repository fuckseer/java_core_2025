package laba4;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("количество строк");
        int rows = scanner.nextInt();

        System.out.print("количество столбцов");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("введите элементы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("введите номер столбца для вывода");
        int columnNumber = scanner.nextInt();

        System.out.println("Столбец номер " + columnNumber);
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][columnNumber]);
        }
    }
}
