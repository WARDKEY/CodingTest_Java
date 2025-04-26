class Solution {
    public int solution(int n) {
        int fibo = 0;   // fibo(n-2)
        int answer = 1; // fibo(n-1)
        int count = 1;  // n번 카운트
        
        while(count < n){
            int num = fibo;
            fibo = answer;
            answer = (fibo + num) % 1234567;

            count++;
        }
        
        return answer;
    }
}