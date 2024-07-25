package basics;

import java.util.Scanner;

public class Programmers147355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String p = sc.next();

        int lenT = t.length();
        int lenP = p.length();

        int count = 0;

        for(int i = 0; i <= lenT - lenP; i++) {
            String subStr = t.substring(i, i + lenP);

            if(subStr.compareTo(p) <= 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
