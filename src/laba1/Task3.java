package laba1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String week_day = in.nextLine();
        System.out.println("Введите месяц: ");
        String month = in.nextLine();
        System.out.println("Введите день: ");
        int day = in.nextInt();
        System.out.println("Сегодня: " + week_day + " " + month + " " + day);
        in.close();
    }
}