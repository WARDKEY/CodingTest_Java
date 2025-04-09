import java.util.*;

// 0제거 -> 0제거후 길이를 이진 변환 -> 0제거 후 길이 이진 변환 -> "1"이 될 때까지
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int cnt = 0;

        while (!s.equals("1")) {
            int zeros = s.length();
            s = s.replace("0", "");  
            zeros -= s.length();
            count += zeros;

            s = Integer.toString(s.length(), 2);
            cnt++;
        }

        answer[0] = cnt;
        answer[1] = count;
        return answer;
    }
}