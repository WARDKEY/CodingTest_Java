class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s = "";
        
        for(int i : array){
            s += Integer.toString(i);
        }
        
        String[] arr = s.split("");
        
        for(String a : arr){
            if(a.equals("7")){
                answer++;
            }
        }
        
        
        
        return answer;
    }
}