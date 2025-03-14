import java.util.*;
import java.io.*;

class Main{
    
   public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       HashSet<Integer> set = new HashSet<>(); 
       
       for(int s : Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()){
           set.add(s);
       }
       
       int M = Integer.parseInt(br.readLine());
       int[] marr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       Main.sol(set, marr);
   }
    
   static void sol(HashSet set, int[] marr){
       StringBuilder sb = new StringBuilder();
       
       for(int num : marr){
           sb.append(set.contains(num) ? "1 " : "0 ");
       }
       
       System.out.println(sb.toString().trim());
   }
}
