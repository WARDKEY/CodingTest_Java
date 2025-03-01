import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String string = s.toUpperCase();
        
        char[] arr = string.toCharArray();
        
        int pcnt = 0;
        
        int ycnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(Character.toString(arr[i]).equals("P")){
                pcnt +=1;
            }
            
            if(Character.toString(arr[i]).equals("Y")){
                ycnt +=1;
            }
        }
        
        if(pcnt == ycnt){
            answer = answer;
        }else if(pcnt != ycnt){
            answer = false;
        }else if(pcnt == 0 && ycnt == 0){
            answer = answer;
        }

        return answer;
    }
}