package laba3;

import java.util.LinkedList;
import java.util.List;

public class Task6_2 {
    public static void main(String[] args) {
        int N = 10000;
        List<Integer> circle = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        long startTime = System.currentTimeMillis();

        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("оставшийся человек: " + circle.get(0));
        System.out.println("время LinkedList: " + (endTime - startTime));
    }
}