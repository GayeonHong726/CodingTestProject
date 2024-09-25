package PCCP;
import java.util.*;

public class PCCP1 {
    class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {
            Map<Integer, Integer> attackInfo = new HashMap<>();
            int curHealth = health;
            int success = 0;

            for(int[] attack : attacks){
                attackInfo.put(attack[0],attack[1]);
            }

            for(int i = 1; i <= attacks[attacks.length-1][0]; i++){
                // 공격에 대한 처리
                if(attackInfo.containsKey(i)){
                    // 키에 대한 값만큼 체력 감소
                    curHealth -= attackInfo.get(i);
                    success = 0;
                } else {
                    curHealth += bandage[1];
                    success++;
                    if(success == bandage[0]){
                        curHealth += bandage[2];
                        success = 0;
                    }
                    if(curHealth > health){
                        curHealth = health;
                    }
                }
                if(curHealth <= 0){
                    return -1;
                }
            }
            return curHealth;
        }
    }
}
