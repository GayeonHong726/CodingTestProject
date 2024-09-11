package basics;

public class Programmers12947 {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int sum = 0;
            int newX = x;
            while(newX > 0){
                sum = sum + (newX % 10);
                newX /= 10;
            }

            if(x % sum != 0){
                answer = false;
            }

            return answer;
        }
    }
}
