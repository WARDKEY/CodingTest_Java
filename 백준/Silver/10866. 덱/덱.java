import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        deque(n, br, bw);
    }
    
    public static void deque(int n, BufferedReader br, BufferedWriter bw) throws IOException{
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_front")){
                dq.addFirst(Integer.parseInt(st.nextToken()));
            }else if(s.equals("push_back")){
                dq.addLast(Integer.parseInt(st.nextToken()));
            }else if(s.equals("pop_front")){
                if(dq.isEmpty()){
                    sb.append(-1 + "\n");
                }else{
                    sb.append(dq.removeFirst() + "\n");
                }
            }else if(s.equals("pop_back")){
                if(dq.isEmpty()){
                    sb.append(-1 + "\n");
                }else{
                    sb.append(dq.removeLast() + "\n");
                }
            }else if(s.equals("size")){
                sb.append(dq.size() + "\n");
            }else if(s.equals("empty")){
                if(dq.isEmpty()){
                    sb.append(1 + "\n");
                }else{
                    sb.append(0 + "\n");
                }
            }else if(s.equals("front")){
                if(dq.isEmpty()){
                    sb.append(-1 + "\n");
                }else{
                    sb.append(dq.peekFirst() + "\n");
                }
            }else if(s.equals("back")){
                if(dq.isEmpty()){
                    sb.append(-1 + "\n");
                }else{
                    sb.append(dq.peekLast() + "\n");
                }
            }
        }
        
        bw.write(sb.toString());
        bw.close();
    }
}