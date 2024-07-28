package basics;

import java.util.*;
public class Baekjoon2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int num = sc.nextInt();
                pq.offer(num); // 추가
            }
        }

        for(int i = 0; i < N; i++) {
            if (!pq.isEmpty()) {
                result = pq.poll();
            }
        }

        System.out.println(result);
    }
}
