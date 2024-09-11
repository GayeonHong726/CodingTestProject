package basics;
import java.util.*;
public class Baekjoon14425 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        String temp;
        int result = 0;

        for(int i = 0; i < N; i++){
            temp = sc.next();
            set.add(temp);
        }

        for(int i = 0; i< M; i++){
            temp = sc.next();
            if(set.contains(temp)){
                result++;
            }
        }
        System.out.println(result);
    }
}
