package KAKAO;

public class KAKAO67256 {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int left = 10;
            int right = 12;
            for(int e:numbers){
                if(e==1 || e==4 || e==7){
                    answer += "L";
                    left = e;
                } else if(e==3 || e==6 || e==9){
                    answer += "R";
                    right = e;
                } else {
                    if(e == 0) e=11;
                    int leftDis = Math.abs(e-left)/3 + Math.abs(e-left)%3;
                    int rightDis = Math.abs(e-right)/3 + Math.abs(e-right)%3;

                    if(leftDis > rightDis) {
                        answer += "R";
                        right = e;
                    }else if (leftDis < rightDis) {
                        answer += "L";
                        left = e;
                    }else {
                        if(hand.equals("right")) {
                            answer += "R";
                            right = e;
                        }else{
                            answer += "L";
                            left = e;
                        }
                    }
                }
            }
            return answer;
    }
}
