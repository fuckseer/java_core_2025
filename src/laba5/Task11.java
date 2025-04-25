package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task11 {

    public static List<Integer> filterLessThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(num -> num < threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Integer> originalNumbers = new ArrayList<>();

        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            originalNumbers.add(number);
        }

        System.out.print("введите пороговое значение ");
        int threshold = scanner.nextInt();

        List<Integer> filteredNumbers = filterLessThan(originalNumbers, threshold);

        System.out.println("\nисходные числа: " + originalNumbers);
        System.out.println("числа меньшие чем " + threshold + ": " + filteredNumbers);

        scanner.close();
    }
}
