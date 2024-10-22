package KAKAO;
import java.util.HashMap;

public class KAKAO92334 {
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = {};
            int member = id_list.length;
            HashMap<String, Integer> listMap = new HashMap<>();
            boolean[][] result = new boolean[member][member];
            int count = 0;

            for(int i = 0; i < member; i++){
                listMap.put(id_list[i],i);
            }

            for(int i = 0; i < report.length; i++){
                String[] list = report[i].split(" ");
                if(!result[listMap.get(list[0])][listMap.get(list[1])]) {
                    result[listMap.get(list[0])][listMap.get(list[1])] = true;
                }
            }

            for(int i = 0 ; i < member; i++){
                if(result[i][0]) count++;
                if(count >= k){}
            }
            return answer;
        }
    }
}
