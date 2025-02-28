import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        
        for(int a : arr){
            if(a % divisor == 0){
                list.add(a);
                cnt += 1;
            }
        }
        
        if(cnt == 0){
            int[] answer = {-1};
            return answer;
        }
        
        Integer[] listing = list.toArray(new Integer[list.size()]);
        
        int[] answer = Arrays.stream(listing).mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}