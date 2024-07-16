package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] day = new int[N + 1];
        int[] pay = new int[N + 1];
        int[] DP = new int[N + 1];

        for(int i = 0; i < N; i++) {
            day[i] = sc.nextInt();
            pay[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            System.out.println("🥕i+day[i] : "+ (i+day[i]) );
            System.out.println("🐽DP[i]+pay[i]) : "+ (DP[i]+pay[i]) );
            if(i + day[i] <= N) {
                DP[i+day[i]] = Math.max(DP[i+day[i]], DP[i]+pay[i]);
                System.out.println("🐼DP[i+day[i]] : " + DP[i+day[i]]);
            }
            DP[i+1] = Math.max(DP[i+1], DP[i]);
            System.out.println("🐳DP[i+1] : "+DP[i+1]);
        }
        System.out.println(DP[N]);
    }
}