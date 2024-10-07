package basics;
import java.util.*;

public class Programmers12921 {
    class Solution {
        public int solution(int n) {
            boolean[] answer = new boolean[n + 1];
            Arrays.fill(answer, true);
            answer[0] = answer[1] = false;

            for (int i = 2; i * i <= n; i++) {
                if (answer[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        answer[j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (answer[i]) {
                    count++;
                }
            }

            return count;
        }
    }
}
