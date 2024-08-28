import java.util.*;

class Solution {
    public int solution(int a, int b) {
        
        int bu = b;
        int mo = a;
        for(int i = bu; i > 0; i--){
            if(bu % i == 0 && mo % i == 0){
                bu /= i;
                mo /= i;
            }
        }
        
        
         while( bu != 1) {
            if(bu % 2 == 0) {
                bu /= 2;
            }else if (bu % 5 == 0) {
                bu /= 5;
            }else {
                return 2;
            }
        }
        
        return 1;
        
    }
}