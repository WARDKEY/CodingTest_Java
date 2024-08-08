class Solution {
    public int solution(int n) {
        int answer = 0;
        int ten = 10*9*8*7*6*5*4*3*2*1;
        int nine = 9*8*7*6*5*4*3*2*1;
        int eight = 8*7*6*5*4*3*2*1;
        int seven = 7*6*5*4*3*2*1;
        int six = 6*5*4*3*2*1;
        int five = 5*4*3*2*1;
        int four = 4*3*2*1;
        int three = 3*2*1;
        int two = 2*1;
        int one = 1;
        
        if(ten <= n){
            answer = 10;
        }else if(nine <= n){
            answer = 9;
        }else if(eight <= n){
            answer = 8;
        }else if(seven <= n){
            answer = 7;
        }else if(six <= n){
            answer = 6;
        }else if(five <= n){
            answer = 5;
        }else if(four <= n){
            answer = 4;
        }else if(three <= n){
            answer = 3;
        }else if(two <= n){
            answer = 2;
        }else if(one <= n){
            answer = 1;
        }
            
        
        
        
        return answer;
    }
}