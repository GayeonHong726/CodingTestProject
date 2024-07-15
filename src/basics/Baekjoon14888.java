package basics;

import java.util.*;

public class Baekjoon14888 {

    public static int Max = Integer.MIN_VALUE; // min_value 로 설정하므로써 가능한 최솟값으로 시작해 어떤 값이든 넘어서게 함
    public static int Min = Integer.MAX_VALUE; // max_value 로 설정하므로써 가능한 최댓값으로 시작해 어떤 값이든 작게하기 위함
    public static int N; // 수의 개수
    public static int[] number; // 숫자를 담는 배열
    public static int[] operator = new int[4]; // 연산자 개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        number = new int[N]; // N 만큼의 숫자 배열 생성

        for(int i = 0; i < N; i++) {
            number[i] = sc.nextInt(); // 배열 담기
        }

        for(int i=0; i < 4; i++) {
            operator[i] = sc.nextInt(); // 연산자 사용 가능 개수 입력
        }

        dfs(number[0],1);

        System.out.println(Max); // 최댓값 출력
        System.out.println(Min); // 최솟값 출력
    }

    public static void dfs(int num, int idx) { // 깊이 우선 탐색 함수
        System.out.println("num=" + num);
        if(idx == N) {
            Max = Math.max(Max, num);
            Min = Math.min(Min, num);
            return;
        }

        for(int i=0; i<4; i++) {
            if(operator[i] > 0) {
                System.out.println("number["+idx+"]= "+number[idx]);
                operator[i]--; // 연산자 사용 후 개수 줄이기
                switch (i) {
                    case 0 : dfs(num + number[idx], idx+1); break;
                    case 1 : dfs(num - number[idx], idx+1); break;
                    case 2 : dfs(num * number[idx], idx+1); break;
                    case 3 : dfs(num / number[idx], idx+1); break;
                }
                operator[i]++;
            }
        }
    }
}
