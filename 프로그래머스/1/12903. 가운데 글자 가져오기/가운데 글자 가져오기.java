
import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        int middle = s.length() % 2;
        
        if(middle == 0){
            answer = Character.toString(arr[(s.length()/2) -1]) + Character.toString(arr[s.length() / 2]);
        }else {
            answer = Character.toString(arr[(s.length()/2)]);
        }
        
        
        return answer;
    }
}