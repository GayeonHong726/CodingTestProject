package basics;
import java.util.Scanner;
public class Programmers43165 {
    int answer = 0;
    public int solution(int[] numbers, int target){
        dfs(numbers, target, 0, 0);
        return answer;
    }

    private void dfs(int[] numbers, int target, int depth, int sum){
        if(depth == numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }

        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 입력 : ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.print("배열의 각 원소 입력 : ");
        for(int i =0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("타겟 넘버 입력하기 : ");
        int target = sc.nextInt();

        Programmers43165 solution = new Programmers43165();
        int result = solution.solution(numbers, target);

        System.out.println(result);
        sc.close();
    }
}
