import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(n != 0){
            sb.append(n % 3);
            n /= 3;
        }
        

        String three = sb.toString();
        int length = three.length();
        
        for(int i = 0; i < length; i++){
            answer += (three.charAt(i) - '0') * Math.pow(3, length - i - 1);
        }
        
        return answer;
    }

}