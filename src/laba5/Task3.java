package laba5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {
    public static int[] getIntersection(int[] array1, int[] array2) {
        Set<Integer> set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());

        return Arrays.stream(array1)
                .filter(set2::contains)
                .distinct()
                .toArray();
    }

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            firstArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            secondArray[i] = scanner.nextInt();
        }

        int[] intersection = getIntersection(firstArray, secondArray);

        System.out.println("Первый массив: " + Arrays.toString(firstArray));
        System.out.println("Второй массив: " + Arrays.toString(secondArray));
        System.out.println("Общие элементы: " + Arrays.toString(intersection));
    }
}
