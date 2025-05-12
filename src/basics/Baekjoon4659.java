package basics;
//
//import java.util.Scanner;
//
//public class Baekjoon4659 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        while(true) {
//            String password = sc.next();
//
//            if(password.equals("end")) break;
//
//            if(isAcceptable(password)) System.out.println("<"+password+"> is acceptable.");
//            else System.out.println("<"+password+"> is not acceptable.");
//        }
//    }
//
//    private static boolean isAcceptable(String password){
//        String moeum = "aeiou";
//        boolean hasMoeum = false; // 모음 포함 여부
//        int countMoeum = 0; // 연속되는 모음 개수
//        int countJaeum = 0; // 연속되는 자음 개수
//
//        for(int i = 0; i < password.length(); i++){
//            char current = password.charAt(i); // 한글자씩
//
//            // String.indexOf(char ch) : 문자열에서 특정 문자가 처음 등장하는 인덱스 반환
//            if(moeum.indexOf(current) != -1){ // -1이 아니다 즉 모음이 존재
//                hasMoeum = true;
//                countMoeum++;
//                countJaeum = 0;
//            } else {
//                countJaeum++;
//                countMoeum = 0;
//            }
//
//            if(countMoeum == 3 || countJaeum == 3) {
//                return false;
//            }
//
//            if(i > 0) {
//                char prev = password.charAt(i-1); // 이전 문자
//                if(current == prev && !(current == 'e' || current == 'o')){
//                    return false;
//                }
//            }
//        }
//        return hasMoeum;
//    }
//}

import java.util.Scanner;

public class Baekjoon4659 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            String password = sc.next();
            if(password.equals("end")) break;

            if(isAcceptable(password))
                System.out.println("<"+password+"> is acceptable");
            else
                System.out.println("<"+password+"> is not acceptable");
        }
    }

    private static boolean isAcceptable(String password){
        String moeum = "aeiou";
        boolean hasMoeum = false;
        int countMoeum = 0;
        int countJaeum = 0;

        for(int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);

            if(moeum.indexOf(current) != -1) {
                hasMoeum = true;
                countMoeum++;
                countJaeum = 0;
            } else {
                countJaeum++;
                countMoeum = 0;
            }

            if(countJaeum == 3 || countMoeum == 3) {
                return false;
            }

            if(i > 0) {
                char prev = password.charAt(i - 1);
                if(current == prev && !(current == 'e' || current == 'o')){
                    return false;
                }
            }
        }
        return hasMoeum;
    }
}