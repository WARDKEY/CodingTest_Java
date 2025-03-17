import java.util.*;

class Solution {
    public int solution(int[] nums) {

        int len = nums.length;
        Arrays.sort(nums);
        
        // 소수 카운트
        int count = 0;
        
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                for(int k = j+1; k < len; k++){
                    int n = nums[i] + nums[j] + nums[k];
                    
                    if(Solution.isPrime(n)){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    // 소수 판별
    static boolean isPrime(int num){
        for(int i = 2; i <num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}