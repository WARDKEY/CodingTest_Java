import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        stack(n, br, bw);
    }

    public static void stack(int n, BufferedReader br, BufferedWriter bw) throws IOException {
        Stack<String> sk = new Stack<>();
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            if (command.equals("push")) {
                sk.push(st.nextToken());
            } else if (command.equals("pop")) {
                if (!sk.isEmpty()) {
                    ls.add(sk.pop());
                } else {
                    ls.add("-1");
                }
            } else if (command.equals("size")) {
                ls.add(String.valueOf(sk.size()));
            } else if (command.equals("top")) {
                if (sk.isEmpty()) {
                    ls.add("-1");
                } else {
                    ls.add(sk.peek());
                }
            } else if (command.equals("empty")) {
                if (sk.isEmpty()) {
                    ls.add("1");
                } else {
                    ls.add("0");
                }
            }
        }
        
        for (String result : ls) {
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
