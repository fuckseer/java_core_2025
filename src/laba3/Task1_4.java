package laba3;

public class Task1_4 {
    public static void main(String[] args) {
        System.out.println("Факториал 5 = " + fact(5));
    }

    public static int fact(int n) {
        if (n == 1) return 1;
        else {
            return fact(n - 1) * n;
        }
    }
}

