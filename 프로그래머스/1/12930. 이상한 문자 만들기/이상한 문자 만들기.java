class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        
        StringBuilder sb = new StringBuilder();
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == ' '){
                sb.append(' ');
                index = 0;
                continue;
            }
            
            if(index % 2 == 0){
                sb.append(Character.toUpperCase(arr[i]));
                index += 1;
            }else{
                sb.append(Character.toLowerCase(arr[i]));
                index += 1;
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}