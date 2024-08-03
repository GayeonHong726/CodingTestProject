package basics;
import java.util.*;

public class Baekjoon11725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 노드의 개수

        ArrayList<Integer>[] tree = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            tree[num1].add(num2);
            tree[num2].add(num1);
        }

        // DFS
        int[] parent = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        visited[1] = true;
        while (!stack.isEmpty()) {
            int cur = stack.pop();

            for (int child : tree[cur]) {
                if (!visited[child]) {
                    stack.push(child);
                    parent[child] = cur;
                    visited[child] = true;
                }
            }
        }

        // 결과 출력
        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }
}