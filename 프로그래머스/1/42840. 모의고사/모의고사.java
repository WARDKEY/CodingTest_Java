import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 정답 찍는 방식
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        
        // 맞춘 개수
        int sol1 = 0;
        int sol2 = 0;
        int sol3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(num1[i%num1.length] == answers[i]){
                sol1++;
            }
        }
        
        for(int i = 0; i < answers.length; i++){
            if(num2[i%num2.length] == answers[i]){
                sol2++;
            }
        }
        
        for(int i = 0; i < answers.length; i++){
            if(num3[i%num3.length] == answers[i]){
                sol3++;
            }
        }
        
        if(sol1 > sol2){
            if(sol1 > sol3){
                answer.add(1);
            }else if(sol1 == sol3){
                answer.add(1);
                answer.add(3);
            }else{
                answer.add(3);
            }
        }else if(sol1 == sol2){
            if(sol1 > sol3){
                answer.add(1);
                answer.add(2);
            }else if(sol1 == sol3){
                answer.add(1);
                answer.add(2);
                answer.add(3);
            }else{
                answer.add(3);
            }
        }else{
            if(sol2 > sol3){
                answer.add(2);
            }else if(sol2 == sol3){
                answer.add(2);
                answer.add(3);
            }else{
                answer.add(3);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}