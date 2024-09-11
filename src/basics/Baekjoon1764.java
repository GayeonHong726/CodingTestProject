package basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1764 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        String people;

        for(int i = 0; i < N; i++){
            people = sc.next();
            set.add(people);
        }

        for(int i = 0; i < M; i++){
            people=sc.next();
            if(set.contains(people)){
                list.add(people);
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for(String str : list){
            System.out.println(str);
        }

    }
}
