package basics;

public class Programmers388351 {
    class Solution {
        public int solution(int[] schedules, int[][] timelogs, int startday) {
            int num = schedules.length;
            int answer = 0;

            for(int i = 0; i < num; i++){
                boolean isOnTime = true;

                for(int j = 0; j < 7; j++){
                    int currentDay = (startday + j - 1) % 7 + 1;

                    if(currentDay == 6 || currentDay == 7) continue;

                    int hope = schedules[i];
                    int actual = timelogs[i][j];

                    // 희망시간
                    int hopeHour = hope / 100;
                    int hopeMin = hope % 100;

                    hopeMin += 10;
                    if (hopeMin >= 60) {
                        hopeHour += 1;
                        hopeMin -= 60;
                    }

                    int hopeTime = hopeHour * 100 + hopeMin;

                    if(actual > hopeTime) {
                        isOnTime = false;
                        break;
                    }
                }

                if(isOnTime) answer++;
            }
            return answer;
        }
    }
}
