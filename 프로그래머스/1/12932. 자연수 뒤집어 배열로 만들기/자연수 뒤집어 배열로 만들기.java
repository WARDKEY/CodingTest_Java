class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        
        String s = String.valueOf(n);
        
        int[] answer = new int[s.length()];
        
        String[] srr = s.split("");
        
        for(String ss : srr){
            sb.append(ss);
        }
        
        String[] arr = sb.reverse().toString().split("");
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}