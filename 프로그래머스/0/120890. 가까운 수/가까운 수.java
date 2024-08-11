import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 10000;
        int idx = 2;
        
        for(int i = 0; i < array.length; i++){
            int a = array[i] -n;
            if(a < 0){
                a *= -1;
            }else{
                a *= 1;
            }
            
            if(a == min){
                if(array[i] < array[idx]){
                    min = a;
                    idx = i;
                }
            }
            
            if(a < min){
                min = a;
                idx = i;
            }
            
        }
        
        answer = array[idx];
        
        return answer;
    }
}