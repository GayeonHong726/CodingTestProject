package basics;
import java.util.*;

public class Programmers42883 {
    class Solution {
        public String solution(String number, int k) {
            Stack<Character> stack = new Stack<>();
            int len = number.length() - k;

            for(int i = 0; i < number.length(); i++){
                char n = number.charAt(i);
                while(!stack.isEmpty() && k > 0 && stack.peek() < n) {
                    stack.pop();
                    k--;
                }

                stack.push(n);
            }

            StringBuilder sb = new StringBuilder();

            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }

            return sb.reverse().substring(0,len);

//            Stack<Character> stack = new Stack<>();
//            // String 을 char[] 배열로 변환하는 메서드
//            for(char n : number.toCharArray()){
//                while(!stack.isEmpty() && k > 0 && stack.peek() < n){
//                    stack.pop();
//                    k--;
//                }
//                stack.push(n);
//            }
//            // 제거해야 할 숫자가 남아있다면 스택의 뒤에서부터 제거!
//            while(k-- > 0){
//                stack.pop();
//            }
//
//            StringBuilder result = new StringBuilder();
//            // pop() 할 때만 LIFO 규칙이 적용!
//            // 아래의 경우는 "저장된 순서" 그대로 접근
//            for(char s : stack){
//                result.append(s);
//            }
//            // StringBuilder 후에는 toString() 처리 필수!
//            return result.toString();
        }
    }
}
