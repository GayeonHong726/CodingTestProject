package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9046 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 로 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); // 첫 줄 읽기

        for(int i = 0; i < num; i++){
            String line = br.readLine(); // 한줄씩 읽기
            int[] freq = new int[26]; // 알파벳 26자의 빈도 저장 배열

            // 각 문자에 대한 빈도 카운트
            for(int j = 0; j < line.length(); j++){
                char ch = line.charAt(j);
                if(ch >= 'a' && ch <= 'z'){ // 문자인가?
                    freq[ch - 'a']++; // 해당 알파벳 순서 인덱스 값 증가
                }
            }

            // 최대 빈도 찾기
            int max = 0;
            for(int f : freq){
                if(f > max){
                    max = f;
                }
            }

            // 최대 빈도 문자 확인
            int count = 0;
            char result = '?';
            for (int j = 0; j < 26; j++){
                if(freq[j] == max){
                    count++;
                    result = (char) (j + 'a');
                }
            }

            // 결과 출력
            if(count > 1) {
                System.out.println('?');
            } else {
                System.out.println(result);
            }
        }
    }
}
