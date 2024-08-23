class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer++;
            
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
            n--;
        }
        return answer;
    }
}