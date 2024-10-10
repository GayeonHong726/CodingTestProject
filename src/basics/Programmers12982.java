package basics;
import java.util.Arrays;

public class Programmers12982 {
    public static void main(String[] args){
        int[] d = {1,3,2,5,4};
        int budget = 9;

        int sum = 0;
        int answer = 0;

        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            if(sum > budget){
                answer = i;
                break;
            }
        }
        if (sum <= budget){
            answer = d.length;
        }

        System.out.println(answer);
    }
}
