package KAKAO;

import java.util.HashMap;

public class KAKAO118666 {
    public static void main(String[] args){
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        char[] type = {'R','T','C','F','J','M','A','N'};
        HashMap<Character, Integer> typeMap = new HashMap<>();

        String answer = "";

        for(Character t : type){
            typeMap.put(t,0);
        }

        for(int i = 0; i<survey.length; i++){
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);

            if(choices[i] == 4){
                continue;
            } else if(choices[i] < 4){
                typeMap.put(left, typeMap.get(left) + (4 - choices[i]));
            } else {
                typeMap.put(right, typeMap.get(right) + (choices[i] - 4));
            }
        }

        for(int i = 0; i<type.length; i += 2){
            char left = type[i];
            char right = type[i+1];

            if(typeMap.get(left) >= typeMap.get(right)){
                answer += left;
            }else {
                answer += right;
            }
        }
        System.out.println(answer);
    }
}
