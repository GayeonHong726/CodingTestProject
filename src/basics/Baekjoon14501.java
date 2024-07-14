package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("N = "+N);
        int[][] arr = new int[N][2];
        int result=0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                System.out.println("arr["+i+"]["+j+"] ="+arr[i][j]);
            }
        }

        for(int i = 0; i < N; i++) {
            int t = arr[i][0];
            int p = arr[i][1];

            int a= i + (t-1);
            i = a;
            if (i >= N) break;

            result += p;
        }
    }
}
