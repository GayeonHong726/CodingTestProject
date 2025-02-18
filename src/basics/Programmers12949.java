package basics;

public class Programmers12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length; // arr1의 행 개수 (가로개수)
        int col1 = arr1[0].length; // arr1의 열 개수 (기둥개수)
        int col2 = arr2[0].length; // arr2의 열 개수 (기둥개수)

        // 결과 행열 A의 행(가로) 개수 X B의 열(기둥) 개수
        int[][] answer = new int[row1][col2];

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                for(int k = 0; k < col1; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
