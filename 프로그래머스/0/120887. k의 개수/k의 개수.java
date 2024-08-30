class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String c = String.valueOf(k);
        
        for(int a = i; a <= j; a++){
            
            String[] arr = String.valueOf(a).split("");
            for(String s : arr){
                if(s.equals(c)){
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}