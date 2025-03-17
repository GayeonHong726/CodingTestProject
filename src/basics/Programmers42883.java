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
        }
    }
}
