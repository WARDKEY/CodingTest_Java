import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sol(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    }

    static void sol(int n, int b) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            int a = n % b;
            if (a >= 10) {
                sb.append((char)(a + 55));
            } else {
                sb.append(a);
            }
            n /= b;
        }
        
        System.out.println(sb.reverse().toString());
    }
}
