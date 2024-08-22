class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int cnt = 0;
        for(String s : dic){
            for(String c : spell){
                if(s.contains(c)){
                    cnt++;
                }
            }
            if(cnt == spell.length){
            answer = 1;
            break;
            }else{
                cnt = 0;
            }
        }
        
        
        
        
        return answer;
    }
}