package basics;

public class Programmers12939 {
    class Solution {
        public String solution(String s) {
            String[] arr = s.split(" ");

            int max = Integer.parseInt(arr[0]);
            int min = Integer.parseInt(arr[0]);

            for (String num : arr) {
                int temp = Integer.parseInt(num);

                if (min > temp) {
                    min = temp;
                }

                if (max < temp) {
                    max = temp;
                }
            }

            return min + " " + max;
        }
    }
}
