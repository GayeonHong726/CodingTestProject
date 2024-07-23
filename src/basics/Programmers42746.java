package basics;

import java.util.*;
public class Programmers42746 {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        String[] arr = new String[numbers.length];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if(arr[0].equals("0") && arr[arr.length-1].equals("0")){
            System.out.println("0");
        }else {
            String result = String.join("",arr);
            System.out.println(result);
        }
    }
}
