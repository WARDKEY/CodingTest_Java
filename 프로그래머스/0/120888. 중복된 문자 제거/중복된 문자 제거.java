import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] str = my_string.split("");
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(str));
        ArrayList<String> lll = new ArrayList<>();
        int j =0;
        
        for(String s : lst){
            if(lll.contains(s)){
                continue;
            }else{
                lll.add(s);
            }
        }
        
        for(String a : lll){
            answer.append(a);
        }
        
        
        
        return answer.toString();
    }
}