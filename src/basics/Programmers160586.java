package basics;

import java.util.*;
public class Programmers160586 {
    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            HashMap<Character, Integer> map = new HashMap<>();

            for(int i = 0; i < keymap.length; i++){
                for(int j = 0; j < keymap[i].length(); j++){
                    if(map.containsKey(keymap[i].charAt(j))){
                        if( (j+1) < map.get(keymap[i].charAt(j))){
                            map.replace(keymap[i].charAt(j),j+1);
                        }
                    } else {
                        map.put(keymap[i].charAt(j),j+1);
                    }
                }
            }

            for (int i = 0; i < targets.length; i++){
                int num = 0;
                for ( int j = 0; j < targets[i].length(); j++){
                    Integer mKey = map.get(targets[i].charAt(j));
                    if( mKey != null){
                        num += mKey;
                    } else {
                        num = -1;
                        break;
                    }
                }
                answer[i] = num;
            }
            return answer;
        }
    }
}
