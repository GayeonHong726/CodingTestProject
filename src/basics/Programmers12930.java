package basics;

public class Programmers12930 {
    class Solution {
        public String solution(String s){
            String[] str = s.split(""); // 문자 하나씩 분리
            StringBuilder answer = new StringBuilder();
            int index = 0; // 단어 내에서 인덱스

            for(String c : str){
                if(c.equals(" ")){ // 공백이면 그대로 추가하고 인덱스 초기화
                    index = 0;
                } else {
                    if(index % 2 == 0){
                        c = c.toUpperCase();
                    } else {
                        c = c.toLowerCase();
                    }
                    index++;
                }
                answer.append(c);
            }
            return answer.toString();
        }
    }
}
