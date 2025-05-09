import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = new String[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            arr[i] = Character.toString(s.charAt(i));
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(String st : arr){
            answer += st;
        }        
        
        return answer;
    }
}