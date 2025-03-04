class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int count = phone_number.length() - 4;
        
        String [] arr = phone_number.split("");
        
        for(int i = 0; i < arr.length; i++){
            if(count <= 0){
                sb.append(arr[i]);
                count--;
            }else{
                sb.append("*");
                count--;
            }
        }
        
        answer = sb.toString();
        
        
        
        
        return answer;
    }
}