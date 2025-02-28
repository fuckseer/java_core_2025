package laba1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        int one = number - 1;
        int three = number + 1;
        int four = (one + number + three)*(one + number + three);
        System.out.println(one + " " + number + " " + three + " " + four);
        in.close();
    }
}