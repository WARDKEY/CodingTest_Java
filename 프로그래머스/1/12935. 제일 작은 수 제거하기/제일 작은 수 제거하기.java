import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int temp = Integer.MAX_VALUE;
        int index = 0;
        
        if(arr.length == 1){
            return answer;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            list.add(num);
        }
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) <= temp){
                index = i;
                temp = list.get(i);
            }
        }
        
        list.remove(index);
        
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}