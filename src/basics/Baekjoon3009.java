package basics;
import java.util.*;
public class Baekjoon3009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] rec = new int[3][2];

        for(int i = 0; i < rec.length; i++){
            for(int j = 0; j < rec[0].length; j++){
                rec[i][j] = sc.nextInt();
            }
        }

        int[] arrX = new int[rec.length];
        int[] arrY = new int[rec.length];

        for(int i = 0; i < rec.length; i++){
            arrX[i] = rec[i][0];
            arrY[i] = rec[i][1];
        }

        int x = (arrX[0] == arrX[1]) ? arrX[2] : (arrX[0] == arrX[2]) ? arrX[1] : arrX[0];
        int y = (arrY[0] == arrY[1]) ? arrY[2] : (arrY[0] == arrY[2]) ? arrY[1] : arrY[0];

        System.out.println(x + " " + y);
    }
}
