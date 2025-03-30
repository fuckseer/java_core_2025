package laba3;

public class Task1_5 {
    private static int step = 0;

    public static void main(String[] args) {
        System.out.println("Fibonacci(5) = " + fact(5));
    }

    public static int fact(int n) {
        printIndent(step);
        System.out.println("fact(" + n + ") вызван");
        step++;

        int result;
        if (n == 0)  {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = fact(n - 2) + fact(n - 1);
        }

        step--;
        printIndent(step);
        System.out.println("fact(" + n + ") возвращает " + result);
        return result;
    }

    public static void printIndent(int step) {
        for (int i = 0; i < step; i++) {
            System.out.print("  ");
        }
    }
}
