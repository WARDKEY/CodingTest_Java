import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String ans = "";
        
        char[] arr = my_string.toCharArray();
        
        for(char c : arr){
            ans += Character.toLowerCase(c);
        }
        
        String[] a = ans.split("");
        Arrays.sort(a);
        
        for(String s : a){
            answer.append(s);
        }
        
        return answer.toString();
    }
}