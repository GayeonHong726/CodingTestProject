package basics;

public class Programmers12918 {
    class Solution {
        public boolean solution(String s) {

            if(s.length() == 4 || s.length() == 6) {
                for(char c : s.toCharArray()) {
                    if(c < '0' || c > '9') {
                        return false;
                    }
                }
                return true;
            }

            return false;
        }
    }
}
