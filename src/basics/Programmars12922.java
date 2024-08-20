package basics;

public class Programmars12922 {
    class Solution {
        public String solution(int n) {
            char a = '수';
            char b = '박';
            String answer = "";

            for(int i = 1; i <= n ; i++){
                answer += (i % 2 != 0) ? a : b;
            }

            return answer;
        }
    }
}
