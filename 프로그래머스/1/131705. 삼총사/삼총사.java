import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        Arrays.sort(number);
        
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                for(int k = j+1; k < number.length; k++){
                    int sum = number[i] + number[j] + number[k];
                    if(sum != 0){
                        sum = 0;
                        continue;
                    }
                    answer++;
                }
            }
        }
        
        return answer;
    }
}