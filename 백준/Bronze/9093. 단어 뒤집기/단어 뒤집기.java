import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<String> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());  
        
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            
            for(String s : str){  
                sb.append(s);
                q.addFirst(sb.reverse().toString());
                sb.setLength(0);
            }
            while(!q.isEmpty()){
                bw.write(q.removeLast() + " ");
            }
            
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
