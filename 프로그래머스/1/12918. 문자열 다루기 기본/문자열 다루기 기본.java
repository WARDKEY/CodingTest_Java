import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(Character.isAlphabetic(arr[i])){
                answer = false;
            }
        }
        
        if(!(arr.length == 4 || arr.length == 6)){
            answer = false;        
        }
        
        return answer;
    }
}