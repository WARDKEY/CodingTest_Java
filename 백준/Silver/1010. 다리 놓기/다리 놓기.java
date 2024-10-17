import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());


            int[][] dp = new int[n + 1][m + 1];


            for (int i = 1; i <= m; i++) {
                dp[1][i] = i;
            }


            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    for (int k = i - 1; k < j; k++) {
                        dp[i][j] += dp[i - 1][k];
                    }
                }
            }


            System.out.println(dp[n][m]);
        }
    }
}
