package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5 {

    public static List<Integer> getSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Integer> originalNumbers = new ArrayList<>();

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            originalNumbers.add(number);
        }

        List<Integer> squaredNumbers = getSquares(originalNumbers);

        System.out.println("\nИсходные числа: " + originalNumbers);
        System.out.println("Квадраты чисел: " + squaredNumbers);

        scanner.close();
    }
}
