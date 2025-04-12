package laba4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_2_fixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;

        while (true) {
            try {
                System.out.print("количество строк");
                rows = scanner.nextInt();
                if (rows <= 0) {
                    throw new IllegalArgumentException("количество должно быть положительным.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: необходимо ввести целое число");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e);
            }
        }

        while (true) {
            try {
                System.out.print("введите количество столбцов");
                cols = scanner.nextInt();
                if (cols <= 0) {
                    throw new IllegalArgumentException("Количество должно быть положительным");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: необходимо ввести целое число.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    try {
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("необходимо ввести целое число");
                        scanner.next();
                    }
                }
            }
        }

        int columnNumber;

        while (true) {
            try {
                System.out.print("введите номер столбца для вывода");
                columnNumber = scanner.nextInt();
                if (columnNumber < 0 || columnNumber > cols) {
                    throw new ArrayIndexOutOfBoundsException("нет столбца с таким номером");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("необходимо ввести целое число");
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e);
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][columnNumber]);
        }
    }
}
