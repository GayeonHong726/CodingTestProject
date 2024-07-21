package basics;

import java.util.*;

public class Baekjoon1260 {

    static int N; // 정점의 개수
    static int M; // 간선의 개수
    static int V; // 시작할 정점의 번호
    static boolean visit[]; // 방문 여부 (DFS, BFS)
    static int graph[][]; // 연결 노드 표시 (양방향)
    static Queue<Integer> que;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        // BFS
        que = new LinkedList<>();
        que.add(V);

        // DFS
        graph = new int[N+1][N+1];

        visit = new boolean[N+1];

        for (int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        // 방문 정보 초기화
        for (int i = 0; i <= N; i++) {
            visit[i] = false;
        }
        DFS(V);

        System.out.println();

        // 방문 정보 초기화
        for (int i = 0; i <= N; i++) {
            visit[i] = false;
        }
        BFS();
    }

    public static void DFS(int start) {
        if(!visit[start]){
            System.out.print(start + " ");
            visit[start] = true;
            for(int i = 1; i <= N; i++) {
                if(graph[start][i] == 1) {
                    DFS(i);
                }
            }
        }else {
            return;
        }
    }

    public static void BFS() {
        int start = que.poll();
        visit[start] = true;
        System.out.print(start + " ");

        for(int i = 1; i <= N; i++) {
            if(graph[start][i] == 1 && !visit[i]) {
                que.add(i); // 큐에 담기
                visit[i] = true; // 방문한 노드는 true
            }
        }

        if(!que.isEmpty()) { // 큐가 비어있지않다면
            BFS();
        }
    }
}
