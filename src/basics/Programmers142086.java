package basics;

public class Programmers142086 {
    class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];

            answer[0] = -1;

            for(int i = 1; i< s.length(); i++){
                boolean found = false;

                for(int j = i - 1; j >= 0; j--){
                    if(s.charAt(i) == s.charAt(j)){
                        answer[i] = i - j;
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    answer[i] = -1;
                }
            }
            return answer;
        }
    }
}
