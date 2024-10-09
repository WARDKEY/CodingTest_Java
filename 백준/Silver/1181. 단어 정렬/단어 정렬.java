import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Main T = new Main();
        T.solution(n, br);
    }
    
    private static void solution(int n, BufferedReader br) throws IOException{
        String[] arr = new String[n];
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }
        
        for(String s : arr){
            set.add(s);
        }
        
        String[] srr = new String[set.size()];
        
        int idx = 0;
        for(String s : set){
            srr[idx++] = s;
        }
        
        Arrays.sort(srr, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);  
            } else {
                return a.length() - b.length();  
            }
        });
        
        for(int i = 0; i < srr.length; i++){
            System.out.println(srr[i]);
        }
        
    }
}