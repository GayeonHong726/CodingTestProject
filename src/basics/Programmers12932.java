package basics;

public class Programmers12932 {
    class Solution {
        public int[] solution(long n) {

            String s ="" + n;

            int[] answer = new int[s.length()];

            int num = 0;
            while(n > 0) {
                answer[num] = (int)(n % 10);
                n /= 10;
                num++;
            }
            return answer;
        }
    }
}
