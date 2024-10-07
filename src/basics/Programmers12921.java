package basics;
import java.util.*;

public class Programmers12921 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= n; j += i){
                    isPrime[j]=false;
                }
            }
        }

        int answer = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
