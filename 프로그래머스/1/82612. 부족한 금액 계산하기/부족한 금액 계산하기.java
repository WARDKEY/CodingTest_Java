class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0L;
        
        long sum = 0L;
        
        for(int i = 1; i <= count; i++){
            sum += price*i;
        }
        
        if(sum <= money){
            answer = 0;
        }else{
            answer = sum - money;
        }

        return answer;
    }
}