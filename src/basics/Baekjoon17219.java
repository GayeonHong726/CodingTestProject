package basics;

import java.io.*;
import java.util.*;

public class Baekjoon17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hm = new HashMap<String, String>();
        StringBuilder sb = new StringBuilder();

        for( int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            hm.put(st.nextToken(), st.nextToken());
        }

        for( int i = 0; i < M; i++) {
            sb.append(hm.get(br.readLine())).append("\n");
        }
        System.out.println(sb);


    }
}
