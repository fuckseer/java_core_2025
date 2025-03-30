package laba3;

import java.util.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.TreeSet;

public class Task10 {
    private static final int N = 9_000_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i < N; i++) {
            arrayList.add(i);
            arrayDeque.addLast(i);
            treeSet.add(i);
        }

        // 4. Удаление из начала
        System.out.println("Удаление одного элемента из начала коллекции:");
        System.out.println("ArrayList: " + getRunningTimeRemoveFirstArrayList(arrayList) + " ms");
        System.out.println("ArrayDeque: " + getRunningTimeRemoveFirstArrayDeque(arrayDeque) + " ms");
        System.out.println("TreeSet: Не поддерживается");

        // 5. Удаление из конца
        System.out.println("\nУдаление одного элемента из конца коллекции:");
        System.out.println("ArrayList: " + getRunningTimeRemoveLastArrayList(arrayList) + " ms");
        System.out.println("ArrayDeque: " + getRunningTimeRemoveLastArrayDeque(arrayDeque) + " ms");
        long treeSetRemoveTime = getRunningTimeRemoveTreeSet(treeSet, N - 1);
        System.out.println("TreeSet: " + treeSetRemoveTime + " ms");

        // 6. Удаление из середины
        System.out.println("\nУдаление одного элемента из середины коллекции:");
        System.out.println("ArrayList: " + getRunningTimeRemoveMiddleArrayList(arrayList) + " ms");
        System.out.println("ArrayDeque: Не поддерживается");
        System.out.println("TreeSet: Не поддерживается");
    }

    // Методы для ArrayList
    private static long getRunningTimeRemoveFirstArrayList(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(0); // Удаляем первый элемент
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveLastArrayList(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(list.size() - 1); // Удаляем последний элемент
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveMiddleArrayList(List<Integer> list) {
        int middle = list.size() / 2;
        long start = System.currentTimeMillis();
        list.remove(middle); // Удаляем элемент из середины
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Методы для ArrayDeque
    private static long getRunningTimeRemoveFirstArrayDeque(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
        deque.removeFirst();
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveLastArrayDeque(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
        deque.removeLast();
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Методы для TreeSet
    private static long getRunningTimeRemoveTreeSet(TreeSet<Integer> set, int element) {
        long start = System.currentTimeMillis();
        set.remove(element); // Удаляем элемент
        long end = System.currentTimeMillis();
        return end - start;
    }
}
