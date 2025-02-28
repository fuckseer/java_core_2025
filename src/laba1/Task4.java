package laba1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String month = in.nextLine();
        System.out.println("Введите количество дней в месяце: ");
        int day = in.nextInt();
        System.out.println("Месяц " + month + " содержит " + day);
        in.close();
    }
}