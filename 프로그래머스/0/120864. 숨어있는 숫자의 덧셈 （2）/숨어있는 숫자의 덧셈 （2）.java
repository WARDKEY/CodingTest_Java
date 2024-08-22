class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = "";
        char[] arr = my_string.toCharArray();
        
        for(char c : arr){
            if(Character.isDigit(c)){
                s+= c;
            }else if(s != ""){
                answer += Integer.parseInt(s);
                s = "";
            }
        }
        
        if(s != ""){
                answer += Integer.parseInt(s);
            }
        
        
        
        
        
        return answer;
    }
}