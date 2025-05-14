package basics;

import java.util.*;

public class Baekjoon1764 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++){
            set.add(sc.next());
        }

        for(int i = 0; i < m; i++){
            String name = sc.next();
            if(set.contains(name)) {
                list.add(name);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(String name : list){
            System.out.println(name);
        }
    }
}
