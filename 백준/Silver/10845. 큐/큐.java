import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        queue(n, br, bw);
    }
    
    public static void queue(int n, BufferedReader br, BufferedWriter bw) throws IOException {
        Deque<String> dq = new LinkedList<>();
        List<String> ls = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());  
            String a = st.nextToken();
            
            if(a.equals("push")){
                dq.addLast(st.nextToken());
            } else if(a.equals("pop")){
                if(dq.isEmpty()){
                    ls.add("-1");
                } else {
                    ls.add(dq.removeFirst());
                }
            } else if(a.equals("size")){
                ls.add(Integer.toString(dq.size()));
            } else if(a.equals("empty")){
                if(dq.isEmpty()){
                    ls.add("1");
                } else {
                    ls.add("0");
                }
            } else if(a.equals("front")){
                if(dq.isEmpty()){
                    ls.add("-1");  
                } else {
                    ls.add(dq.peekFirst());  
                }
            } else if(a.equals("back")){
                if(dq.isEmpty()){
                    ls.add("-1");
                } else {
                    ls.add(dq.peekLast());  
                }
            }
        }
        
        for(String re : ls){  
            bw.write(re + "\n");
        }
        bw.flush();
        bw.close();
    }
}
