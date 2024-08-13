class Solution {
    public long solution(String numbers) {
        String answer = "";
        
        while(true){
            if(numbers.length() == 3 || numbers.length() == 4 || numbers.length() == 5){
                if(numbers.equals("one")){
                    answer += "1";
                    
                }else if(numbers.equals("two")){
                    answer += "2";
                     
                }else if(numbers.equals("six")){
                    answer += "6";
                     
                }else if(numbers.equals("three")){
                    answer += "3";
                     
                }else if(numbers.equals("four")){
                    answer += "4";
                     
                }else if(numbers.equals("five")){
                    answer += "5";
                     
                }else if(numbers.equals("seven")){
                    answer += "7";
                     
                }else if(numbers.equals("eight")){
                    answer += "8";
                     
                }else if(numbers.equals("nine")){
                    answer += "9";
                     
                }else if(numbers.equals("zero")){
                    answer += "0";
                     
                }
                break;
                
            }else{
            
            if(numbers.substring(0, 3).equals("one") || numbers.substring(0, 3).equals("two") ||numbers.substring(0, 3).equals("six")){
                if(numbers.substring(0, 3).equals("one")){
                    answer += "1";
                     numbers = numbers.substring(3);
                }else if(numbers.substring(0, 3).equals("two")){
                    answer += "2";
                     numbers = numbers.substring(3);
                }else if(numbers.substring(0, 3).equals("six")){
                    answer += "6";
                     numbers = numbers.substring(3);
                }
                
            }else if(numbers.substring(0, 4).equals("zero") || numbers.substring(0, 4).equals("four") || numbers.substring(0, 4).equals("five") || numbers.substring(0, 4).equals("nine")){
                if(numbers.substring(0, 4).equals("zero")){
                    answer += "0";
                    numbers = numbers.substring(4);
                }else if(numbers.substring(0, 4).equals("four")){
                    answer += "4";
                     numbers = numbers.substring(4);
                }else if(numbers.substring(0, 4).equals("five")){
                    answer += "5";
                     numbers = numbers.substring(4);
                }else if(numbers.substring(0, 4).equals("nine")){
                    answer += "9";
                     numbers = numbers.substring(4);
                }
            }else if(numbers.substring(0, 5).equals("three") || numbers.substring(0, 5).equals("seven") || numbers.substring(0, 5).equals("eight")){
                if(numbers.substring(0, 5).equals("three")){
                    answer += "3";
                     numbers = numbers.substring(5);
                }else if(numbers.substring(0, 5).equals("seven")){
                    answer += "7";
                     numbers = numbers.substring(5);
                }else if(numbers.substring(0, 5).equals("eight")){
                    answer += "8";
                     numbers = numbers.substring(5);
                }
            }
        
        
        }
        }
        long ans = Long.parseLong(answer);
        
        return ans;
    }
}

