import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Main T = new Main();
        
        T.solution(n, br);
    }
    
    private static void solution(int n, BufferedReader br) throws IOException{
        String[][] arr = new String[n][4];
        
        for(int i = 0; i < arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }
        
        Arrays.sort(arr ,(a1, a2) -> {
            if(Integer.parseInt(a2[3]) - Integer.parseInt(a1[3]) != 0){
                return Integer.parseInt(a2[3]) - Integer.parseInt(a1[3]);
            }
            if( Integer.parseInt(a2[2]) - Integer.parseInt(a1[2]) != 0){
                return Integer.parseInt(a2[2]) - Integer.parseInt(a1[2]);
            }
            return Integer.parseInt(a2[1]) - Integer.parseInt(a1[1]);
            
            
        });
        
        System.out.println(arr[0][0]);
        System.out.println(arr[n-1][0]);
        
    }
}