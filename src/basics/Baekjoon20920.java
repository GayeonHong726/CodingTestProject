package basics;

import java.io.*;
import java.util.*;

public class Baekjoon20920 {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String word = br.readLine();
            if(word.length() >= M) {
                map.put(word,map.getOrDefault(word,0) + 1);
            }
        }

        List<String> wordList = new ArrayList<>(map.keySet());

        wordList.sort((a,b) -> {
            int freq = map.get(b) - map.get(a);
            if(freq != 0) return freq;

            int len = b.length() - a.length();
            if(len != 0) return len;

            return a.compareTo(b);
        });

        for(String word : wordList){
            bw.write(word);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
