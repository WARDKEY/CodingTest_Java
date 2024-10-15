import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        fibonacci(n);
    }

    private static void fibonacci(int n){
        long num1 = 0;
        long num2 = 1;
        long num3 = 1;
        
        for(long i = 1; i < n; i++ ){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        System.out.print(num3);
        
    }

    
}
