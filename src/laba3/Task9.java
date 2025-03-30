package laba3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.TreeSet;

public class Task9 {
    private static final int N = 9000000;

    public static void main(String[] args) {
        // Инициализация коллекций
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            arrayDeque.add(i);
            treeSet.add(i);
        }


        // 1. Добавление в начало
        System.out.println("Добавление одного элемента в начало коллекции:");
        System.out.println("ArrayList: " + getRunningTimeAddFirstArrayList(arrayList) + " ms");
        System.out.println("ArrayDeque: " + getRunningTimeAddFirstArrayDeque(arrayDeque) + " ms");
        System.out.println("TreeSet: Не поддерживается");

        // 2. Добавление в конец
        System.out.println("\nДобавление одного элемента в конец коллекции:");
        System.out.println("ArrayList: " + getRunningTimeAddLastArrayList(arrayList) + " ms");
        System.out.println("ArrayDeque: " + getRunningTimeAddLastArrayDeque(arrayDeque) + " ms");
        System.out.println("TreeSet: " + getRunningTimeAddTreeSet(treeSet) + " ms");

        // 3. Добавление в середину
        System.out.println("\nДобавление одного элемента в середину коллекции:");
        System.out.println("ArrayList: " + getRunningTimeInsertMiddleArrayList(arrayList) + " ms");
        System.out.println("ArrayDeque: Не поддерживается");
        System.out.println("TreeSet: Не поддерживается");
    }

    // Методы для ArrayList
    private static long getRunningTimeAddFirstArrayList(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.add(0, -1); // Добавляем элемент -1 в начало
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddLastArrayList(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.add(N, -2); // Добавляем элемент -2 в конец
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeInsertMiddleArrayList(List<Integer> list) {
        int middle = list.size() / 2;
        long start = System.currentTimeMillis();
        list.add(middle, -3); // Добавляем элемент -3 в середину
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Методы для ArrayDeque
    private static long getRunningTimeAddFirstArrayDeque(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
        deque.addFirst(-1); // Добавляем элемент -1 в начало
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddLastArrayDeque(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
        deque.addLast(-2); // Добавляем элемент -2 в конец
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Методы для TreeSet
    private static long getRunningTimeAddTreeSet(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        set.add(-1); // Добавляем элемент -1
        long end = System.currentTimeMillis();
        return end - start;
    }
}