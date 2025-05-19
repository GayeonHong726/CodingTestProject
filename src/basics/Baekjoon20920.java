package basics;

import java.util.*;

public class Baekjoon20920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            String sen = sc.next();
            if(sen.length() >= M){
                // 외우자
                map.put(sen, map.getOrDefault(sen,0) + 1);
            }
        }
        sc.close();

        List<String> wordList = new ArrayList<>(map.keySet());
        // 람다
//        wordList.sort((a,b) -> {
//            int freq = map.get(b) - map.get(a); // 빈도수 비교
//            int len = b.length() - a.length(); // 길이 비교
//            // 빈도가 같지않다면 빈도가 높은 순, 같다면 단어가 긴 순
//            return freq != 0 ? freq : len;
//        });

        // 정렬
        Collections.sort(wordList, new Comparator<String>(){

            @Override
            public int compare(String a, String b) {
                int freq = map.get(b) - map.get(a); // 1. 빈도 비교
                if(freq != 0) {
                    return freq;
                }

                int len = b.length() - a.length(); // 2. 길이 비교
                if(len != 0) {
                    return len;
                }

                return a.compareTo(b); // 3. 알파벳 정렬
            }
        });

        // 출력
        for(String word : wordList){
            System.out.println(word);
        }


    }

}
