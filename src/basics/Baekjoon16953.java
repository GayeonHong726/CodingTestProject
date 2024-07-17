package basics;

import java.util.Scanner;

public class Baekjoon16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;

        while (a <= b) {
            if(b == a) {
                System.out.println(count);
                break;
            }
            if(b % 10==1){
                b = b/10;
            } else if(b % 2 == 0){
                b = b/2;
            }else {
                break;
            }
            count++;
        }

        if (b != a) {
            System.out.println(-1);
        }
        sc.close();
    }
}
