package basics;
//import java.util.Arrays;
//import java.util.Scanner;
//public class Programmers42842 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int brown = sc.nextInt();
//        int yellow = sc.nextInt();
//
//        int[] answer = new int[2];
//
//        int area = brown + yellow;
//
//        // yellow 가 존재하기 위해서는 가로세로 길이가 모두 3이상
//        for(int i = 3; i <= area; i++){
//            int height = i;
//            int width = area / height;
//
//            if(width < 3){
//                continue;
//            }
//
//            if(width >= height) {
//                if( (width - 2) * (height - 2) == yellow){
//                    answer[0] = width;
//                    answer[1] = height;
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(answer));
//    }
//}
import java.util.Scanner;
import java.util.Arrays;
public class Programmers42842{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int brown = sc.nextInt();
        int yellow = sc.nextInt();

        int area = brown + yellow;
        for(int width = 3; width < area; width++){
            if(area % width == 0){
                int height = area / width;

                if((width + height) * 2 - 4 == brown){
                    System.out.println(Arrays.toString(new int[]{width, height}));
                    break;
                }

                System.out.println(Arrays.toString(new int[]{}));
            }
        }
    }
}