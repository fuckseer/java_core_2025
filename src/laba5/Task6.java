package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {

    public static List<String> filterBySubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> originalStrings = new ArrayList<>();

        System.out.println("введите " + n + " строк:");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            originalStrings.add(input);
        }

        System.out.print("введите подстроку для поиска: ");
        String substring = scanner.nextLine();

        List<String> filteredStrings = filterBySubstring(originalStrings, substring);

        System.out.println("\ncтроки содержащие подстроку \"" + substring + "\":");
        for (String s : filteredStrings) {
            System.out.println(s);
        }

        scanner.close();
    }
}