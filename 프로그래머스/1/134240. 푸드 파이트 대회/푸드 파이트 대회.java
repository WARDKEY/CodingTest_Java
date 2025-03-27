import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder() ;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(0);
        int num = food.length -1;
        
        for(int n = food.length-1; n >= 1; n--){
            
            for(int i = 0; i < food[n]/2; i++){
                deque.addFirst(num);
            }
            
            for(int j = 0; j < food[n]/2; j++){
                deque.addLast(num);
            }
            
            num--;
        }
        
        for(int s : deque){
            sb.append(String.valueOf(s));
        }
        
        return sb.toString();
    }
}