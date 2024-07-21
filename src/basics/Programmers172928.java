package basics;

import java.util.*;

public class Programmers172928 {
    public static void main(String[] args){

        String[] park = {"SOO","OXX","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(Arrays.toString(solution(park,routes)));
    }

    static public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        String[][] arr = new String[park.length][park[0].length()];

        for ( int i =0; i<park.length; i++) {
            for ( int j = 0; j < park[0].length(); j++) {
                arr[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        int x = 0;
        int y = 0;

        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length(); j++) {
                if(arr[i][j].equals("S")) {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            // StringTokenizer는 자바에서 문자열을 토큰으로 분리할 때 사용하는 클래스
            StringTokenizer st = new StringTokenizer(route);
            String direction = st.nextToken();
            int len = Integer.parseInt(st.nextToken());

            switch ( direction ) {
                case "E" :
                    if (y + len < park[0].length()) {
                        boolean blocked = false;
                        for (int j = y + 1; j <= y + len; j++) {
                            if (arr[x][j].equals("X")) {
                                blocked = true;
                                break;
                            }
                        }
                        if (!blocked) {
                            y += len;
                        }
                    }
                    break;
                case "W" :
                    if (y - len >= 0) {
                        boolean blocked = false;
                        for (int j = y - 1; j >= y - len; j--) {
                            if (arr[x][j].equals("X")) {
                                blocked = true;
                                break;
                            }
                        }
                        if (!blocked) {
                            y -= len;
                        }
                    }
                    break;
                case "S" :
                    if (x + len < park.length) {
                        boolean blocked = false;
                        for (int j = x + 1; j <= x + len; j++) {
                            if (arr[j][y].equals("X")) {
                                blocked = true;
                                break;
                            }
                        }
                        if (!blocked) {
                            x += len;
                        }
                    }
                    break;
                case "N" :
                    if (x - len >= 0) {
                        boolean blocked = false;
                        for (int j = x - 1; j >= x - len; j--) {
                            if (arr[j][y].equals("X")) {
                                blocked = true;
                                break;
                            }
                        }
                        if (!blocked) {
                            x -= len;
                        }
                    }
                    break;
            }
        }
        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}
