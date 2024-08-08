import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int f = numbers[numbers.length -1];
        
        int s = numbers[numbers.length -2];
        
        answer = f*s;
        
        return answer;
    }
}