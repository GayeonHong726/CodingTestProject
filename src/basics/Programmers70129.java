package basics;
import java.util.*;

public class Programmers70129 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] answer = new int[2];
        int zero = 0;
        int count = 0;

        while(!s.equals("1")){
            int lenBefore = s.length();
            System.out.println("lenBefore : " + lenBefore);

            s = s.replaceAll("0","");
            System.out.println("replaceAll s :" + s);

            zero += (lenBefore - s.length());
            System.out.println("s.length() : " + s.length());

            System.out.println("zero : " + zero);

            s = Integer.toBinaryString(s.length());
            System.out.println("s :" + s);
            count++;
            System.out.println("count : " + count);
        }

        answer[0] = count;
        answer[1] = zero;

        System.out.println(Arrays.toString(answer));
    }
}
