import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        int[] arr = d;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            budget -= arr[i];
            
            if(budget == 0){
                answer ++;
                return answer;
            }else if(budget < 0){
                return answer;
            }
            answer++;
        }
        
        
        return answer;
    }
}