import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        T.solution(br);
    }
    
    private static void solution(BufferedReader br) throws IOException {
        int sum = 0;
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            ls.add(Integer.parseInt(br.readLine()));
        }
        
        for(int n : ls){
            sum += n;
        }
        
        sum -= 100;
        
        boolean find = false;
        for(int i = 0; i < ls.size(); i++){
            for(int j = i+1; j < ls.size(); j++){
                if(ls.get(i)+ls.get(j) == sum){
                    ls.remove(j);
                    ls.remove(i);
                    find = true;
                    break;
                }
                if(find){
                    break;
                }
            }
        }
        
        Collections.sort(ls);
        
        for(int a : ls){
            System.out.println(a);
        }
        
    }
}