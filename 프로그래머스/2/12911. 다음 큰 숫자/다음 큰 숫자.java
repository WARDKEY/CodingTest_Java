import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = n;

        int num = Integer.bitCount(n);
    
        while(true){
            answer++;
            if(Integer.bitCount(answer) == num){
                break;
            }            
        }    
        return answer;
    }
}