package laba1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения");
        int year = in.nextInt();
        int old = 2025 - year;
        System.out.println(old + " лет");
        in.close();
    }
}