package laba3;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    private static final long N = 90000000;
    private static final int M = 1000000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            arrayList.add(i);
        }

        // 7. Получение элемента по индексу
        System.out.println("Получение одного элемента по индексу в коллекциях:");
        System.out.println("ArrayList: " + getRunningTimeGetByIndexArrayList(arrayList, M) + " ms");

    }

    // Методы для ArrayList
    private static long getRunningTimeGetByIndexArrayList(List<Integer> list, long accesses) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        return end - start;
    }

}
