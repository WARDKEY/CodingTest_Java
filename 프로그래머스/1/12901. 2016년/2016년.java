class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int totalDay = 0;
        
        int[] days= {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i = 1; i < a; i++){
            totalDay += days[i];
        }
        
        
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        answer = week[(totalDay + b - 1) % 7];
        
        
        return answer;
    }
}