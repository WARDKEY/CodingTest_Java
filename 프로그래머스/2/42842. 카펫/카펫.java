import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        // 카펫의 총넓이
        int area = brown + yellow;
        
        // i가 3인 이유는 노란색이 1이면 최소 3이기 때문
        
        // 최소 세로 길이 3부터 카펫의 넓이의 제곱근까지(카펫의 높이(세로)는 카펫의 너비보다 작거나 같기 때문)
        for(int i = 3; i <= Math.sqrt(area); i++ ){
            if(area % i == 0){  // 넓이가 세로로 나누어진다면
                int width = area/i; // 가로는 넓이 나누기 세로
                if((width - 2) * (i - 2) == yellow){    // 카펫의 넓비 공식 (카펫의 가로 - 2) * (카펫의 세로 -2)
                    answer[0] = width;
                    answer[1] = i;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}