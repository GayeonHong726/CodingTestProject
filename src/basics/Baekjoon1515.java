package basics;

import java.io.*;

public class Baekjoon1515 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        int pt = 0;
        int N = 1;

        while(true){
            String cur = Integer.toString(N);

            for(int i = 0; i < cur.length(); i++){
                if(pt < target.length() && target.charAt(pt) == cur.charAt(i)){
                    pt++;
                }
                if(pt == target.length()){
                    System.out.println(N);
                    return;
                }
            }
            N++;
        }
    }
}
