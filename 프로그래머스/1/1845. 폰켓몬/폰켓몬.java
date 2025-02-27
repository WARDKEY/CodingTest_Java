import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int select = nums.length/2;
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], 1);
        }
        
        int kind = map.size();
        
        if(select == 0){
            answer = 1;
        }else if(kind < select){
            answer = kind;
        }else if(kind > select){
            answer = select;
        }else if(kind == select){
            answer = kind;
        }
        

        

    
        return answer;
    }
    
}