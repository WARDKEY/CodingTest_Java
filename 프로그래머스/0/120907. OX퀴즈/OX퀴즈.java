class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int j = 0;
        for(String s : quiz){
            String[] arr = s.split(" ");
            for(int i = 0; i < arr.length; i++){
                if(arr[i].equals("+")){
                    int y = Integer.parseInt(arr[i-1]) + Integer.parseInt(arr[i+1]);
                    if(y == Integer.parseInt(arr[arr.length-1])){
                        answer[j] = "O";
                        j++;
                    }else{
                        answer[j] = "X";
                            j++;
                    }  
                }else if(arr[i].equals("-")){
                    int z = Integer.parseInt(arr[i-1]) - Integer.parseInt(arr[i+1]);
                    if(z == Integer.parseInt(arr[arr.length-1])){
                        answer[j] = "O";
                        j++;
                    }else{
                        answer[j] = "X";
                            j++;
                    }
                }
            }
        }
        
        
        return answer;
    }
}