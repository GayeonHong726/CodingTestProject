package basics;
import java.util.Arrays;
public class Programmers42748 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {
                // 원본 배열, 복사할 시작인덱스, 복사할 끝인덱스
                int[] copy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

                Arrays.sort(copy); // 배열 오름차순 정렬
                answer[i] = copy[commands[i][2] - 1];
            }
            return answer;
        }
    }
}
