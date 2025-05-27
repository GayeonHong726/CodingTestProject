package basics;

import java.util.*;
import java.io.*;

//public class Baekjoon1213 {
//        public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String name = br.readLine();
//
//        Map<Character,Integer> map = new HashMap<>();
//        for(char c : name.toCharArray()) {
//            map.put(c,map.getOrDefault(c,0) + 1);
//        }
//
//        int oddCount = 0;
//        char oddChar = 0;
//        for(char c : map.keySet()){
//            if(map.get(c) % 2 != 0) {
//                oddCount++;
//                oddChar = c;
//            }
//        }
//
//        if(oddCount > 1){
//            bw.write("I'm Sorry Hansoo");
//        } else {
//            List<Character> keys = new ArrayList<>(map.keySet());
//            Collections.sort(keys); // 알파벳 정렬
//
//            StringBuilder half = new StringBuilder();
//
//            for(char key : keys) {
//                int count = map.get(key) / 2;  // 1 / 2 => 0 홀수 처리됨
//                for (int i = 0; i < count; i++) {
//                    half.append(key);
//                }
//            }
//
//            StringBuilder result = new StringBuilder();
//            result.append(half);
//
//            if(oddCount == 1) {
//                result.append(oddChar);
//            }
//
//            result.append(half.reverse());
//
//            bw.write(result.toString());
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}
public class Baekjoon1213 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String name = br.readLine();

        Map<Character, Integer> map = new HashMap<>();

        for(char c : name.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        char oddChar = 0;
        for(char c : map.keySet()) {
            if(map.get(c) % 2 != 0) {
                oddCount++;
                oddChar = c;
            }
        }

        if(oddCount > 1) {
            bw.write("I'm Sorry Hansoo");
        } else {
            List<Character> keys = new ArrayList<>(map.keySet());
            Collections.sort(keys);

            StringBuilder half = new StringBuilder();

            for(char key : keys) {
                int count = map.get(key) / 2;
                for(int i = 0; i < count; i++){
                    half.append(key);
                }
            }

            StringBuilder result = new StringBuilder();
            result.append(half);

            if(oddCount == 1) {
                result.append(oddChar);
            }

            result.append(half.reverse());

            bw.write(result.toString());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}