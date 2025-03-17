import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 2; i <= n; i++){
            if(n%i == 1){
                if(min >= i){
                    answer = i;
                    min = i;
                }
            }
        }
        
        return answer;
    }
}