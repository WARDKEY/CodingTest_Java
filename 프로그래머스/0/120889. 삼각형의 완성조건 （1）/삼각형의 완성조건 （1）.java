import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int idx = 0;
        int sum = 0;
        
        for(int i = 0; i < sides.length; i++){
            if(sides[i] >= max){
                max = sides[i];
                idx = i;
            }
        }
        
        for(int j =0; j < sides.length; j++){
            if(j == idx){
                continue;
            }else{
                sum += sides[j];
            }
        }
        
        if(sum > max){
            answer = 1;
        }else{
            answer = 2;
        }
        
        
        return answer;
    }
}