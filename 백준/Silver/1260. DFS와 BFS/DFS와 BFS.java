import java.util.*;
import java.io.*;

class Main {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static boolean[] bvisited;
    public static boolean[] dvisited;

    public static void dfs(int s){
        dvisited[s] = true;
        System.out.print(s + " ");

        for(int i = 0; i < graph.get(s).size(); i++){
            int y = graph.get(s).get(i);
            if(!dvisited[y]){
                dfs(y);
            }
        }
    }

    public static void bfs(int s){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(s);
        bvisited[s] = true;

        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x + " ");

            for(int i = 0; i < graph.get(x).size(); i++){
                int y = graph.get(x).get(i);
                if(!bvisited[y]){
                    q.offer(y);
                    bvisited[y] = true;
                }
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int n = Integer.parseInt(num[1]);
        int s = Integer.parseInt(num[2]);

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i <= a; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < arr.length; i++){
            graph.get(arr[i][0]).add(arr[i][1]);
            graph.get(arr[i][1]).add(arr[i][0]); // 양방향
        }

        for (int i = 0; i <= a; i++) {
            Collections.sort(graph.get(i)); // 작은 숫자부터 방문
        }

        dvisited = new boolean[a + 1];
        bvisited = new boolean[a + 1];

        dfs(s);
        System.out.println();
        bfs(s);
    }
}
