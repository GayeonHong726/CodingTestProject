package basics;
import java.util.*;
public class Programmers42840 {
    class Solution {
        public int[] solution(int[] answers) {
            int[] math1 = {1,2,3,4,5};
            int[] math2 = {2,1,2,3,2,4,2,5};
            int[] math3 = {3,3,1,1,2,2,4,4,5,5};
            int[] score = {0,0,0};

            for(int i = 0; i < answers.length; i++){
                if(answers[i] == math1[i % math1.length]) score[0]++;
                if(answers[i] == math2[i % math2.length]) score[1]++;
                if(answers[i] == math3[i % math3.length]) score[2]++;
            }

            int max = Math.max(score[0], Math.max(score[1], score[2]));

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < score.length; i++){
                if(max == score[i]) list.add(i + 1);
            }

            int[] result = new int[list.size()];
            for(int i = 0; i < result.length; i++){
                result[i] = list.get(i);
            }

            return result;
        }
    }
}
