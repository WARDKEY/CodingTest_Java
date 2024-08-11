import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] str = cipher.split("");
        
        for(int i = 0; i < str.length; i++){
            if((i+1)%code == 0){
                answer.append(str[i]);
            }
        }
        
        return answer.toString();
    }
}