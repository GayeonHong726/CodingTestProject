package basics;
import java.util.*;
public class Programmers42586 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> list = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();

            for(int i = 0; i < progresses.length; i++){
                int day = (int)Math.ceil((100.0-progresses[i]) / speeds[i]);
                queue.add(day); // queue[7,3,9]
            }

            while(!queue.isEmpty()){
                int count = 1; // 기본 1개 가능
                int first = queue.poll(); // 첫 요소 꺼내기

                while (!queue.isEmpty() && queue.peek() <= first){
                    count++;
                    queue.poll();
                }
                list.add(count);
            }
            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}
