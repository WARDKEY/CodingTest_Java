import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Main T = new Main();
        T.solution(n, br);
    }
    
    private static void solution( int n, BufferedReader br) throws IOException{
        String[][] arr = new String[n][2];
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        
        Arrays.sort(arr, (a1, a2) -> {
            return Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]);
        });
        
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}