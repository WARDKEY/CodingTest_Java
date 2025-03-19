import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int s = commands[i][0]-1;
            int e = commands[i][1]-1;
            int n = commands[i][2]-1;
            
            int len = e-s+1;
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int j = s; j <= e; j++){
                list.add(array[j]);
            }
            
            Collections.sort(list);
            
            answer[i] = list.get(n);
            
        }
        
        return answer;
    }
}