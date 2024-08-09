import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        char[] arr = my_string.toCharArray();
        List<Integer> answer = new ArrayList<>();
        
        for(int i =0; i < arr.length; i++){
            if(Character.isDigit(arr[i])){
                answer.add(Character.getNumericValue(arr[i]));        
            }
            
        }
        
        answer.sort(Comparator.naturalOrder());
        
        return answer;
    }
}