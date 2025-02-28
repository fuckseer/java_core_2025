package laba1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст");
        int old = in.nextInt();
        int year = 2025 - old;
        System.out.println(year + " год рождения");
        in.close();
    }
}