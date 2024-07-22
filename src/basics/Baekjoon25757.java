package basics;

import java.util.*;

public class Baekjoon25757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt(); // 플레이 신청 횟수
        String game = sc.next(); // 플레이할 게임의 종류

        HashSet<String> people = new HashSet<>();
        for(int i = 0; i < Num; i++) {
            people.add(sc.next());
        }

        switch(game){
            case "Y":
                System.out.println(people.size());
                break;
            case "F":
                System.out.println(people.size()/2);
                break;
            case "O":
                System.out.println(people.size()/3);
                break;
        }
    }
}
