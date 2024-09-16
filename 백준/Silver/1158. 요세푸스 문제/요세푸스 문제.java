import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        List<Integer> ls = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            ls.add(i);
        }
        
        int idx = 0;
        sb.append("<");
        
        while(ls.size() > 1){
            idx = (idx + k - 1) % ls.size();
            sb.append(ls.get(idx)).append(", ");
            ls.remove(idx);
        }
        
        sb.append(ls.get(0)).append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
