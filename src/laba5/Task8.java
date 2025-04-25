package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task8 {

    public static List<String> filterByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
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

        System.out.print("введите минимальную длину");
        int minLength = scanner.nextInt();

        List<String> filteredStrings = filterByLength(originalStrings, minLength);

        System.out.println("\nисходные строки:");
        for (String s : originalStrings) {
            System.out.println(s);
        }

        System.out.println("\nстроки с длиной больше " + minLength);
        for (String s : filteredStrings) {
            System.out.println(s);
        }

        scanner.close();
    }
}