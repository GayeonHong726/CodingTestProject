package basics;

import java.util.Set;
import java.util.HashSet;

public class Programmers1845 {

    class Solution {
        public int solution(int[] nums) {
            Set<Integer> set = new HashSet<>();

            int num = (int) nums.length/2;

            for(int n : nums){
                set.add(n);
            }

//         if(set.size() > num){
//             return num;
//         } else return set.size();

            return (set.size() > num) ? num : set.size();
        }
    }
}
