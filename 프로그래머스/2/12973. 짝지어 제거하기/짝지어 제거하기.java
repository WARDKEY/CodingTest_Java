import java.util.*;

class Solution{
    public int solution(String s)    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        
        if(stack.isEmpty()){
            answer = 1;
        }

        return answer;
    }
}

// 스택을 사용 스택이 비어있지 않고 짝이 맞으면 pop, 
// 스택이 비어있거나, 짝이 안 맞으면 추가