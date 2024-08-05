import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        
        String[] mose = letter.split(" ");
        
        for(String s : mose){
            if(s.equals(".-")){
                sb.append("a");
            }else if(s.equals("-...")){
                sb.append("b");
            }else if(s.equals("-.-.")){
                sb.append("c");
            }else if(s.equals("-..")){
                sb.append("d");
            }else if(s.equals(".")){
                sb.append("e");
            }else if(s.equals("..-.")){
                sb.append("f");
            }else if(s.equals("--.")){
                sb.append("g");
            }else if(s.equals("....")){
                sb.append("h");
            }else if(s.equals("..")){
                sb.append("i");
            }else if(s.equals(".---")){
                sb.append("j");
            }else if(s.equals("-.-")){
                sb.append("k");
            }else if(s.equals(".-..")){
                sb.append("l");
            }else if(s.equals("--")){
                sb.append("m");
            }else if(s.equals("-.")){
                sb.append("n");
            }else if(s.equals("---")){
                sb.append("o");
            }else if(s.equals(".--.")){
                sb.append("p");
            }else if(s.equals("--.-")){
                sb.append("q");
            }else if(s.equals(".-.")){
                sb.append("r");
            }else if(s.equals("...")){
                sb.append("s");
            }else if(s.equals("-")){
                sb.append("t");
            }else if(s.equals("..-")){
                sb.append("u");
            }else if(s.equals("...-")){
                sb.append("v");
            }else if(s.equals(".--")){
                sb.append("w");
            }else if(s.equals("-..-")){
                sb.append("x");
            }else if(s.equals("-.--")){
                sb.append("y");
            }else if(s.equals("--..")){
                sb.append("z");
            }
        }
        
        
        return sb.toString();
    }
}