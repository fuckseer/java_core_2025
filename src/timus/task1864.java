package timus;

import java.util.Scanner;

public class task1864 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        double average = (double)sum / (n + 1);
        int m = 0;
        for(int i=0; i<n; i++){
            if(a[i] > average){
                m++;
            }
        }
        int[] result = new int[n];
        if(m > 0){
            int share = 100 / m;
            for(int i=0; i<n; i++){
                if(a[i] > average){
                    result[i] = share;
                } else {
                    result[i] = 0;
                }
            }
        } else {
            for(int i=0; i<n; i++){
                result[i] = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(result[i]);
            if(i != n-1) sb.append(" ");
        }
        System.out.println(sb);
    }
}
