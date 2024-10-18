import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{

    private static int dp[];
    
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int number = Integer.parseInt(br.readLine());
       makeOne(number);
    }

    private static void makeOne(int number){
        dp = new int[number+1]; 
           dp[0] = 0;
           dp[1] = 0;

           for (int i = 2; i <= number; i++){
               dp[i] = dp[i-1] + 1;
               if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
               if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
           }
           System.out.println(dp[number]);
    }
}