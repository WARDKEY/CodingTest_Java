import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Main T = new Main();

        T.solution(n, k, br);
    }

    private static void solution(int n, int k, BufferedReader br) throws IOException{
        Integer[] arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
                
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a1, a2) -> {
            return a2 - a1;
        });

        System.out.println(arr[k-1]);
        

    }
}