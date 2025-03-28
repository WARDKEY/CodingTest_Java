import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx = 0;
        
        for(int i = 0; i < photo.length; i++){
            int score = 0;
            for(int j = 0; j < photo[i].length; j++){
                for(int k = 0; k < name.length; k++){
                    if(name[k].equals(photo[i][j])){
                        score += yearning[k];
                    }else{
                        score += 0;
                    }
                }
            }
            answer[idx++] = score;
        }
        
        
        return answer;
    }
}