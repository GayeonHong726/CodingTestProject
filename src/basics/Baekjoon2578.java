package basics;

import java.util.Scanner;

public class Baekjoon2578 {
    static int bingo[][] = new int[5][5];
    static int result;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                bingo[i][j] = sc.nextInt();
            }
        }

        for(int a = 1; a <= 25; a++){
            int call = sc.nextInt();

            for( int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(bingo[i][j] == call){
                        bingo[i][j] = 0;
                    }
                }
            }

            result = 0;

            rBingo();
            cBingo();
            lrBingo();
            rlBingo();

            if(result >= 3){
                System.out.println(a);
                break;
            }
        }
    }

    public static void rBingo(){
        for(int i = 0; i < 5; i++){
            int count = 0;
            for( int j = 0; j < 5; j++){
                if(bingo[i][j] == 0) {
                    count++;
                }
            }
            if(count == 5){
                result++;
            }
        }
    }

    public static void cBingo(){
        for(int i = 0; i < 5; i++){
            int count = 0;
            for( int j = 0; j < 5; j++){
                if(bingo[j][i] == 0) {
                    count++;
                }
            }
            if(count == 5){
                result++;
            }
        }
    }

    public static void lrBingo(){
        int count=0;
        for(int i = 0; i < 5; i++){
            if(bingo[i][i] == 0) {
                count++;
            }
        }
        if(count == 5) {
            result ++;
        }
    }

    public static void rlBingo(){
        int count=0;
        for(int i = 0; i < 5; i++){
            if(bingo[i][4-i] == 0) {
                count++;
            }
        }
        if(count == 5) {
            result ++;
        }
    }

}
