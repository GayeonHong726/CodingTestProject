package basics;
import java.util.Map;
import java.util.HashMap;
public class Programmers131127 {
    class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;

            Map<String, Integer> map = new HashMap<>();

            // 1.
            for(int i = 0; i < want.length; i++){
                map.put(want[i],number[i]);
            }

            // 2.
            for(int i = 0; i < discount.length - 9; i++){
                Map<String,Integer> dMap = new HashMap<>();

                for(int j = 0; j < 10; j++){
                    String item = discount[i + j]; // 시작일로부터 열흘동안의 품목
                    if(!dMap.containsKey(item)){ // dMap에 품목이 없다면
                        dMap.put(item,0);
                    }
                    dMap.put(item,dMap.get(item) + 1); // 품목존재 시 1 증가
                }

                if (map.equals(dMap)){
                    answer++;
                }
            }
            return answer;
        }
    }
}
