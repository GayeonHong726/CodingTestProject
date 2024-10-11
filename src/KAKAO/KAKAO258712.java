package KAKAO;
import java.util.HashMap;
public class KAKAO258712 {
    public static void main(String[] args){
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        int member = friends.length;

        // 이름별로 인덱스 부여하기!
        // muzi : 0, ryan : 1, frodo : 2, neo : 3
        HashMap<String, Integer> friendsMap = new HashMap<>();
        for(int i = 0; i< member; i++){
            friendsMap.put(friends[i],i);
        }

        int[] rate = new int[member];
        int[][] giveTake = new int[member][member];
        for(String gift : gifts){
            String[] name = gift.split(" ");
            rate[friendsMap.get(name[0])]++;
            rate[friendsMap.get(name[1])]--;
            giveTake[friendsMap.get(name[0])][friendsMap.get(name[1])]++;
        }

        int answer = 0;

        for(int i = 0; i < member; i++){
            int count = 0;
            for(int j = 0; j < member; j++){
                if(i==j) continue;

                if(giveTake[i][j] > giveTake[j][i] || (giveTake[i][j]) == giveTake[j][i] && rate[i] > rate[j]){
                    count++;
                }

                if(answer < count){
                    answer = count;
                }
            }
        }

        System.out.println(answer);
    }
}
