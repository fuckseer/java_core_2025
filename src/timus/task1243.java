package timus;
import java.util.Scanner;

public class task1243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine().trim();
        sc.close();

        int mod = 0;
        for(char ch : N.toCharArray()) {
            int digit = ch - '0';
            mod = (mod * 10 + digit) % 7;
        }

        System.out.println(mod);
    }
}
