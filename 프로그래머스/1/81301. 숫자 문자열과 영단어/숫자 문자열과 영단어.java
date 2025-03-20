class Solution {
    public int solution(String s) {
        int answer = 0;
        String ch = "";
        String digit = "";
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                digit += c;
            }else if(Character.isAlphabetic(c)){
                ch += c;
                if(ch.equals("zero")){
                    digit+="0";
                    ch = "";
                }else if(ch.equals("one")){
                    digit+="1";
                    ch = "";
                }else if(ch.equals("two")){
                    digit+="2";
                    ch = "";
                }else if(ch.equals("three")){
                    digit+="3";
                    ch = "";
                }else if(ch.equals("four")){
                    digit+="4";
                    ch = "";
                }else if(ch.equals("five")){
                    digit+="5";
                    ch = "";
                }else if(ch.equals("six")){
                    digit+="6";
                    ch = "";
                }else if(ch.equals("seven")){
                    digit+="7";
                    ch = "";
                }else if(ch.equals("eight")){
                    digit+="8";
                    ch = "";
                }else if(ch.equals("nine")){
                    digit+="9";
                    ch = "";
                }
            }
        }
        
        
        answer = Integer.parseInt(digit);
        
        return answer;
    }
}