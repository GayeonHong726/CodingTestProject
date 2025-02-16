package basics;

import java.util.Queue;
import java.util.LinkedList;

public class Programmers159994_2 {
    public String solution(String[] cards1, String[] cards2, String[] goal){
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        // 배열을 큐로 변환
        for(String card : cards1){
            queue1.offer(card);
        }
        for(String card : cards2){
            queue2.offer(card);
        }

        for (String g : goal){
            if(!queue1.isEmpty() && queue1.peek().equals(g)){
                queue1.poll(); // 큐의 맨 앞 요소 제거
            } else if(!queue2.isEmpty() && queue2.peek().equals(g)){
                queue2.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
