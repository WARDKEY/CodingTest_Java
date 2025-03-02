import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        
        String[] arr = s.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(String ss : arr){
            sb.append(ss);
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}