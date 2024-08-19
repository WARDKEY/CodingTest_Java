import java.util.*;

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for(int i = 0; i < t; i++){
            n += n;
        }
        answer = n;
        return answer;
    }
}