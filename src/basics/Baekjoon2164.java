package basics;

import java.util.*;

public class Baekjoon2164 {
    public static void main(String[] args) {
        // 배열 ----------------------------------------
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        int[] q = new int[2 * N];
//        for(int i = 0; i<=N; i++){
//            q[i] = i;
//        }
//
//        int start_index = 1;
//        int last_index = N;
//
//        while(N-- > 1) {
//            start_index++;
//            q[last_index + 1] = q[start_index];
//            last_index++;
//            start_index++;
//        }
//
//        System.out.println(q[start_index]);

        // Queue ----------------------------------------
        Scanner in =new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int N = in.nextInt();

        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            q.poll(); // 값 지우기
            q.offer(q.poll()); // 값을 지우는 동시에 큐의 끝에 값 추가하기
        }

        System.out.println(q.peek()); // 마지막 남은 원소 출력
    }
}
