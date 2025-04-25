package timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1290 {

    public static List<Integer> computeCounts(List<Integer> numbers) {
        List<Integer> counts = new ArrayList<>();
        if (numbers.isEmpty()) {
            return counts;
        }

        int max = 0;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        int[] freq = new int[max + 2];
        for (int num : numbers) {
            freq[num]++;
        }

        int[] cumFreq = new int[max + 2];
        for (int k = max; k >= 0; k--) {
            cumFreq[k] = cumFreq[k + 1] + freq[k + 1];
        }

        for (int k = 0; ; k++) {
            int count = cumFreq[k];
            if (count == 0) {
                break;
            }
            counts.add(count);
        }

        return counts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> originalNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            originalNumbers.add(scanner.nextInt());
        }

        scanner.close();

        List<Integer> firstCounts = computeCounts(originalNumbers);

        List<Integer> secondCounts = computeCounts(firstCounts);

        for (int count : secondCounts) {
            System.out.println(count);
        }
    }
}