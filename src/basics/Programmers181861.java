package basics;
import java.util.*;
public class Programmers181861 {
    class Solution {
        public int[] solution(int[] arr) {
            List<Integer> list = new ArrayList<>();

            for(int a : arr){
                for(int i = 0; i < a; i++){
                    list.add(a);
                }
            }
            return list.stream().mapToInt(i->i).toArray();
        }
    }
}
