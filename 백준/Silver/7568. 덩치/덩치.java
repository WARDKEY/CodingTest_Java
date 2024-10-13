import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        solution(n, br);

    }

    private static void solution(int n, BufferedReader br) throws IOException{
        int[][] arr = new int[n][2];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        
        for(int i = 0; i < arr.length; i++){
            int cnt = 1;
            
            for(int j = 0; j < arr.length; j++){    
                if( i == j){    
                    continue;
                }

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    cnt++;
                }
            }
            sb.append(cnt).append(" ");
        }

        System.out.print(sb.toString());
        
    }
}