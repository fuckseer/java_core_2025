package timus;

import java.util.Scanner;

public class task2111 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i=0;i<n;i++){
            long di = sc.nextLong();
            sum += di;
        }
        long result = sum * sum;
        System.out.println(result);
    }
}
