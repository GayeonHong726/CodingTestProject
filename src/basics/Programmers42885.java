package basics;
import java.util.Arrays;
public class Programmers42885 {
    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            // 구명보트가 최소가 될 경우는 몸무게가 최대한 적은사람과 많은사람의 탑승
            Arrays.sort(people);
            int min = 0;
            for(int max = people.length - 1; min <= max; max--){
                if(people[min] + people[max] <= limit)
                    min++;
                answer++;
            }

            return answer;
        }
    }
}
