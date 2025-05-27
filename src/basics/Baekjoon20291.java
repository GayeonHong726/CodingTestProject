package basics;

import java.io.*;
import java.util.*;

public class Baekjoon20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            String file = br.readLine();
            String[] split = file.split("\\.");
            map.put(split[1],map.getOrDefault(split[1],0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for(String l : list){
            bw.write(l + " " + map.get(l));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
