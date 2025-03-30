package basics;

public class Programmers12909 {
    class Solution {
        boolean solution(String s) {
            int balance = 0;

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    balance++;
                } else {
                    balance--;
                }

                if(balance < 0) { // 닫힌 괄호가 먼저 나오는 경우
                    return false;
                }
            }
            return balance == 0; // 모든 괄호가 균형을 이루면 true, 아니면 false
        }
    }
}
