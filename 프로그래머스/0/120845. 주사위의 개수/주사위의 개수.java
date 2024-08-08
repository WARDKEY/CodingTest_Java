class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int ga = box[0]/n;
        int se = box[1]/n;
        int no = box[2]/n;
        
        answer = ga * se * no;
        
        
        
        return answer;
    }
}