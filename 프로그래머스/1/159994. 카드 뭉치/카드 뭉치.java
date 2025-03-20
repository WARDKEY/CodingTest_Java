import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        
        for(String s : goal){
            sb1.append(s+ " ");
        }
        
        
        int car1 = 0;
        int car2 = 0;
        
        for(int i = 0; i < goal.length ; i++){
            if(car1 < cards1.length && goal[i].equals(cards1[car1])){
                sb.append(cards1[car1] + " ");
                car1++;
            }else if(car2 < cards2.length && goal[i].equals(cards2[car2])){
                sb.append(cards2[car2] + " ");
                car2++;
            }
        }
        
        if(sb.toString().equals(sb1.toString())){
            answer = "Yes";
        }
        
        
        
        return answer;
    }
}