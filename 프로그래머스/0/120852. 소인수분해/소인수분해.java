import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>(); 
        for(int i = 2; i <= n; i++){
            while(n%i == 0){
                if(!arr.contains(i)){
                    arr.add(i);
                }
                n/=i;
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
            
        
        return answer;
    }
}