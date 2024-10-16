import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        apartment(T, br);
    }

    private static void apartment(int T, BufferedReader br) throws IOException{
        
        for(int i = 0; i < T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] apt = new int[k+1][n+1];

            for(int j = 0; j <=n; j++){
                apt[0][j] = j;
            }

            for(int a = 1; a <= k; a++){
                for(int b = 1; b <= n; b++){
                    apt[a][b] = apt[a][b-1] + apt[a-1][b];
                }
            }
            System.out.println(apt[k][n]);
        
        }

    }

    
}
