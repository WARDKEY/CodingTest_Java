import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        for(int i = 0; i < numlist.length; i++){
            answer[i] = numlist[i];    
        }
        
        int[] arr = new int[numlist.length];
        int temp;
        int tem;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] < 0){
                arr[i] = Math.abs(n+numlist[i]);
            }else{
                arr[i] = Math.abs(n-numlist[i]);
            }                
        }
        
        for(int i = 0; i < numlist.length; i++){
            
            for(int j = i; j < numlist.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    tem = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tem;
                }
            }
        }
        
        for(int i = 0; i < numlist.length; i++){
            
            for(int j = i; j < numlist.length; j++){
                if(arr[i] == arr[j] && answer[i] < answer[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    tem = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tem;
                }
            }
        }
        
        
        
        
        
        return answer;
    }
    
}