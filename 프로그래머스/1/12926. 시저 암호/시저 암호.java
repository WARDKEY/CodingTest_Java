class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        
        for (char ch : arr) {
            if (ch == ' ') {
                sb.append(" ");
                continue;
            }
            
            char c;
            if (Character.isLowerCase(ch)) {
                c = (char) ((ch - 'a' + n) % 26 + 'a');
            } else {
                c = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}