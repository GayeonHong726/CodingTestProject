package basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] freq = new int[26];

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                freq[ch - 'A']++;
            }
        }

        // 최대 빈도 찾기
        int max = 0;
        for(int a : freq){
            if(max < a) {
                max = a;
            }
        }

        int count = 0;
        char result = '?';
        for(int i = 0; i < 26; i++) {
            if(freq[i] == max) {
                count++;
                result = (char) (i + 'A');
            }
        }

        // 결과
        if(count > 1) {
            System.out.println('?');
        } else {
            System.out.println(result);
        }


    }
}
