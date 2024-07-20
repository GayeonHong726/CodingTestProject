package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programmers172928 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3};
        System.out.println(arr.length);

        List<String> park = new ArrayList<>();
        List<String> routes = new ArrayList<>();

        List<Integer> noX = new ArrayList<>();
        List<Integer> noY = new ArrayList<>();
        int startX = 0;
        int startY = 0;

        for(int i = 0; i < 3; i++){
            park.add(sc.next());
        }

        for(int i = 0; i < 3; i++){
            routes.add(sc.next());
        }

        int x = park.get(0).length();
        int y = park.size();

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++){
                if(park.get(j).charAt(i) == 's'){
                    startX = j;
                    startY = i;
                }
                if(park.get(j).charAt(i) == 'x'){
                    noX.add(j);
                    noY.add(i);
                }
            }
        }
        System.out.println();


    }
}
