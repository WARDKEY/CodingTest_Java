import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sol(n, br);
    }
    
    private static void sol(int n, BufferedReader br) throws IOException{
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(br.readLine());
            int q = 0; 
            int d = 0; 
            int k = 0; 
            int p = 0; 
            
            while(a > 0){
                if(a >= 25){
                    q = a / 25;
                    a %= 25;
                } else if(a >= 10){
                    d = a / 10;
                    a %= 10;
                } else if(a >= 5){
                    k = a / 5;
                    a %= 5;
                } else {
                    p = a;
                    a = 0;
                }
            }
            
            System.out.println(q + " " + d + " " + k + " " + p);
        }
    }
}
