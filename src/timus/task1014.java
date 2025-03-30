package timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class task1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        if (N == 0) {
            System.out.println(10);
            return;
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }

        List<Integer> digits = new ArrayList<>();

        for (int d = 9; d >= 2; d--) {
            while (N % d == 0) {
                digits.add(d);
                N /= d;
            }
        }

        if (N != 1) {
            System.out.println(-1);
            return;
        }
        Collections.sort(digits);
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        System.out.println(sb);
    }
}
