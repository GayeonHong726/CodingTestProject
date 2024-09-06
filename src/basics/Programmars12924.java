package basics;

import java.util.*;

public class Programmars12924 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;

        for(int i=1; i <= n; i++){
            int sum = 0;
            for(int j = i; j <= n; j++){
                sum += i;
                if(sum == n){
                    answer++;
                    break;
                }
                if(sum > n){
                    sum = 0;
                }
            }

        }

        System.out.println(answer);
    }
}
