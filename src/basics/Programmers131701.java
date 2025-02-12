package basics;
import java.util.HashSet;
import java.util.Set;

public class Programmers131701 {
    class Solution {
        public int solution(int[] elements) {
            Set<Integer> set = new HashSet<>(); /*유지보수성과 확장성 고려*/
            int len = elements.length;

            for(int size = 1; size <= len; size++){
                for(int i = 0; i < len; i++){
                    int sum = 0;
                    for(int j = i; j < i+size; j++){
                        sum += elements[j%len]; /*배열의 길이를 초과하는 인덱스를 0부터 다시 반복 => 원형 순환 배열*/
                    }
                    set.add(sum);
                }
            }
            return set.size();
        }
    }
}
