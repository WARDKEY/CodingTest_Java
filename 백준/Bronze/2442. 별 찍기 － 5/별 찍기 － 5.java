import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                bw.write(" ");
            }
            for(int k = 1; k <= (2*i)-1; k++){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        
    }
}