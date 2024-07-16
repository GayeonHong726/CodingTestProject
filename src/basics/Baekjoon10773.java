package basics;

import java.util.*;

public class Baekjoon10773 {
    public static void main(String[] args) {
        // 배열 ----------------------------------------
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int top = -1;
        int sum = 0;

        for(int i = 0; i<N; i++) {
            int number = sc.nextInt();

            if(number == 0) {
                top--;
            }else {
                top++;
                arr[top] = number;
            }
        }

        for (int i = 0; i <= top; i++){
            sum += arr[i];
        }
        System.out.println(sum);



        // 스택 -----------------------------------------
//        Stack<Integer> stack = new Stack<>();
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        int sum = 0;
//
//        for(int i=0; i < num; i++) {
//            int N = sc.nextInt();
//
//            if (N == 0) {
//                stack.pop();
//            } else {
//                stack.push(N);
//            }
//        }
//
//        for(int s : stack) {
//            sum += s; // 합계 구하기
//        }
//
//        System.out.println(sum);
    }
}
