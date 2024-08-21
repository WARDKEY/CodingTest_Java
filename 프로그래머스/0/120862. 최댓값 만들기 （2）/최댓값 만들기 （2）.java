import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(numbers);
        
        for(int n : numbers){
            if(n < 0){
                cnt++;
            }
        }
        
        if(cnt >= 2){
            int answer1 = numbers[0]*numbers[1];
            int answer2 = numbers[numbers.length-1]*numbers[numbers.length-2];
            if(answer1 > answer2){
                answer = answer1;
            }else{
                answer = answer2;
            }
        }else{
            answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        }
        
        return answer;
    }
}