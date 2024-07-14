package basics;

import java.util.*;

public class Baekjoon14888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));


    }
}
