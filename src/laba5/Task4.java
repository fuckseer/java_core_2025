package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task4 {

    public static List<String> getCapitalizedStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
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

        List<String> capitalizedStrings = getCapitalizedStrings(originalStrings);

        System.out.println("\nСтроки, начинающиеся с большой буквы:");
        for (String s : capitalizedStrings) {
            System.out.println(s);
        }

        scanner.close();
    }
}