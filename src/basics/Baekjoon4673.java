package basics;

public class Baekjoon4673 {
    public static void main(String[] args){
        boolean[] result = new boolean[10001];

        for( int i = 0; i < 10001; i++){
            int n = d(i);

            if(n < 10001){
                result[n] = true;
            }
        }

        for(int i = 0;i < 10001; i++){
            if(!result[i]){
                System.out.println(i);
            }
        }
    }

    public static int d(int num){
        int sum = num;

        while(num != 0){
            sum = sum + (num % 10); // 첫째 자리수 더해주기
            num = num/10; // 10으로 나누어 자리수 줄여가기
        }

        return sum;
    }
}
