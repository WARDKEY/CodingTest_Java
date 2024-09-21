import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(sol(n, br));
    }
    
    public static int sol(int n, BufferedReader br)throws IOException {
        int[][] arr = new int[100][100];
        for(int i = 0; i < n; i++){
            String[] srr = br.readLine().split(" ");
            int rowInput = Integer.parseInt(srr[1]);
            int colInput = Integer.parseInt(srr[0]);
            

            for(int row = rowInput; row < rowInput+10; row++){
                for(int col = colInput; col < colInput+10; col++){
                    if(arr[row][col] == 1){  
                        continue;
                    } else {
                        arr[row][col] = 1;  
                    }
                }
            }
        }
        

        int answer = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j] == 1){
                    answer++;
                }
            }
        }
        return answer;
    }
}
