import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = String.valueOf(n);
        
        String[] arr = s.split("");
        
        for(String num : arr){
            answer += Integer.parseInt(num);
        }

        return answer;
    }
}