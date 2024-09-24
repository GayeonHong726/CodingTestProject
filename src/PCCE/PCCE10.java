package PCCE;

import java.util.ArrayList;
import java.util.Comparator;

public class PCCE10 {

}
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> result = new ArrayList<>();

        for (int[] aData : data) {
            int index = getIndex(ext);
            if (index != -1 && aData[index] < val_ext) {
                result.add(aData);
            }
        }

        int sortIndex = getIndex(sort_by);
        if (sortIndex != -1) {
            result.sort(Comparator.comparingInt(o -> o[sortIndex]));
        }

        return result.toArray(new int[result.size()][]);
    }

    private int getIndex(String key){
        switch(key){
            case "code" : return 0;
            case "date" : return 1;
            case "maximum" : return 2;
            case "remain" : return 3;
            default : return -1;

        }
    }
}
