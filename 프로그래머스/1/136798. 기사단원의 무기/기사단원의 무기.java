import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        // 무기 개수 배열
        int[] result = new int[number+1];
        
        for(int i = 1; i <= number; i++){
            int count = 0;
            // 약수 개수 구하기 (√i까지만 탐색하여 최적화)
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) { // 제곱수가 아닐 경우 짝이 되는 약수 추가
                        count++;
                    }
                }
            }
            // 무기 공격력이 제한을 넘으면 power로 지정
            if(count > limit){
                count = power;
            }
            
            // 무기 공격력 저장
            result[i] = count;
        }
        
        // 공격력 합 저장
        for(int num : result){
            answer += num;
        }
        
        
        return answer;
    }
}

