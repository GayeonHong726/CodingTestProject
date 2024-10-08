package basics;

public class Programmers12977 {

    public static void main(String[] args){
        int[] nums = {1,2,7,6,4};
        int answer = 0;

        for(int x = 0; x < nums.length; x++){
            if(x + 2 >= nums.length) break;
            for(int y = x + 1; y < nums.length; y++){
                for(int z = y + 1; z < nums.length; z++){
                    if(isPrime(nums[x] + nums[y] + nums[z])){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    private static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
