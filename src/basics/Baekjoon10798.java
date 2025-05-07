package basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon10798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < 5; i++){
            str[i] = br.readLine();
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(i < str[j].length()){
                    result.append(str[j].charAt(i));
                }
            }
        }

        System.out.println(result.toString());
    }
}


//public class Baekjoon10798 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = new String[5];
//        // 문자열 만들기
//        StringBuilder result = new StringBuilder();
//
//        for(int i = 0; i < 5; i++){
//            str[i] = br.readLine();
//        }
//
//        for(int i = 0; i < 15; i++){
//            for(int j = 0; j < 5; j++){
//                if(i < str[j].length()){
//                    result.append(str[j].charAt(i));
//                }
//            }
//        }
//        System.out.println(result.toString());
//    }
//}
