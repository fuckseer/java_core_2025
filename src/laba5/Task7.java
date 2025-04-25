package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {

    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(num -> num % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Integer> originalNumbers = new ArrayList<>();

        System.out.println("введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            originalNumbers.add(number);
        }

        System.out.print("Введите число для проверки делимости: ");
        int divisor = scanner.nextInt();

        List<Integer> divisibleNumbers = filterDivisibleNumbers(originalNumbers, divisor);

        System.out.println("\nисходные: " + originalNumbers);
        System.out.println("числа, делящиеся на " + divisor + " без остатка: " + divisibleNumbers);

        scanner.close();
    }
}