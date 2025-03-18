package basics;
import javax.sound.midi.Soundbank;
import java.util.*;
public class Programmers42860 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int answer = 0;
        int len = name.length();
        int move = len - 1;

        for(int i =0; i<len; i++){
            char ch = name.charAt(i);
            System.out.println("ch["+i+"]="+ch);
            answer += Math.min(ch - 'A' , 'Z' - ch + 1);
            System.out.println("answer"+answer);

            int nextIndex = i + 1;
            System.out.println("nextIndex "+ nextIndex);
            while (nextIndex < len && name.charAt(nextIndex) == 'A'){
                nextIndex++;
                System.out.println("nextIndex++ " + nextIndex);
            }
            System.out.println("move :" + move);
            System.out.println("(i * 2) + (len - nextIndex) " + ((i * 2) + (len - nextIndex)));
            move = Math.min(move, (i * 2) + (len - nextIndex));
            System.out.println("(len - nextIndex) * 2 + i " + ((len - nextIndex) * 2 + i));
            move = Math.min(move, (len - nextIndex) * 2 + i);
            System.out.println("최종 move :"+move);
        }
        System.out.println("answer" + answer);
        System.out.println("move" + move);
        System.out.println("최종결과" + (answer+move));
    }
}
