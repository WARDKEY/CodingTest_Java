import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] a = after.split("");
        String[] b = before.split("");
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int len = after.length();
        int cnt = 0;
        
        for(int i = 0; i < len; i++){
            if(a[i].equals(b[i])){
                cnt++;
            }
        }
        
        if(cnt == len){
            answer = 1;
        }
        
        return answer;
    }
}