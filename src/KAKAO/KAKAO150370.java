package KAKAO;

import java.util.*;
public class KAKAO150370 {
    class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            List<Integer> answer = new ArrayList<>();
            HashMap<String, Integer> termMap = new HashMap<>();
            int date = getDate(today);

            for (String t : terms) {
                String[] term = t.split(" ");
                termMap.put(term[0], Integer.parseInt(term[1]));
            }

            for (int i = 0; i < privacies.length; i++) {
                String[] privacy = privacies[i].split(" ");
                if (getDate(privacy[0]) + (termMap.get(privacy[1]) * 28) <= date) {
                    answer.add(i + 1);
                }
            }

            int[] result = new int[answer.size()];
            for (int i = 0; i < answer.size(); i++) {
                result[i] = answer.get(i);
            }

            return result;
        }

        private int getDate(String today) {
            String[] date = today.split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            return (year * 12 * 28) + (month * 28) + day;
        }
    }

}
