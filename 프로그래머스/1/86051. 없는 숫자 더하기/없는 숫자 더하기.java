import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int n : numbers){
            list.add(n);
        }
        
        for(int i = 0; i <= 9; i++){
            if(!list.contains(i)){
                answer+=i;
            }
        }
        
        
        
        return answer;
    }
}