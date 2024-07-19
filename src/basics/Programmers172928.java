package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programmers172928 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            arr.add(sc.next());
        }

        System.out.println(arr.size());

        System.out.println("indexOf(soo) : " + arr.indexOf("soo"));

        System.out.println(arr.toString());
    }
}
