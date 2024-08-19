class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        String[] arr= str.split("");
        for(String s : arr){
            answer += Integer.parseInt(s);
        }
        
        
        return answer;
    }
}