import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] arr = String.valueOf(x).split("");
        
        if(x == 1){
            return true;
        }
        
        int num = 0;
    
        for(String s : arr){
            num += Integer.parseInt(s);
        }
        
        if(x % num != 0){
            answer = false;
        }
        
        return answer;
    }
}