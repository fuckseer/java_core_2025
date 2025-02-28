package laba1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите количество лет: ");
        int age = in.nextInt();
        System.out.println(name + " " + age + " лет");
        in.close();
    }
}
