package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10 {

    public static List<String> filterOnlyLetterStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> originalStrings = new ArrayList<>();

        System.out.println("Введите " + n + " строк:");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            originalStrings.add(input);
        }

        List<String> filteredStrings = filterOnlyLetterStrings(originalStrings);

        System.out.println("\nисходные строки:");
        originalStrings.forEach(s -> System.out.println("- " + s));

        System.out.println("\nстроки, содержащие только буквы:");
        if (filteredStrings.isEmpty()) {
            System.out.println("Нет строк состоящих только из букв");
        } else {
            filteredStrings.forEach(s -> System.out.println("- " + s));
        }

        scanner.close();
    }
}
