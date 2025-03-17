package basics;

import java.util.*;

public class Programmers120880 {
    class Solution {
        public int[] solution(int[] numlist, int n) {
            Arrays.sort(numlist);

            int len = numlist.length;

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (Math.abs(n - numlist[i]) <= Math.abs(n - numlist[j])) {
                        int temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }
            }
            return numlist;
        }
    }
}
