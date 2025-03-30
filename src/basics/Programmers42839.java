package basics;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class Programmers42839 {
    Set<Integer> numSet = new HashSet<>();
    boolean[] check;

    public int solution(String numbers) {
        check = new boolean[numbers.length()];

        for(int m = 1; m <= numbers.length(); m++){
            dfs(numbers, "" , m);
        }

        // 소수 개수 세기
        int count = 0;
        for(int num : numSet) {
            if(isPrime(num)) count++;
        }

        return count;
    }

    private void dfs(String str, String temp, int m){
        if(temp.length() == m){
            int num = Integer.parseInt(temp);
            numSet.add(num);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            if(!check[i]) {
                check[i] = true;
                dfs(str, temp + str.charAt(i), m);
                check[i] = false;
            }
        }
    }

    // 소수 판별 함수
    private boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("Enter the string of numbers: ");
        String numbers = scanner.nextLine();

        Programmers42839 solution = new Programmers42839();
        int result = solution.solution(numbers);

        // 결과 출력
        System.out.println("Total prime numbers: " + result);

        scanner.close();
    }
}