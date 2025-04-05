import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ", -1); 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 0) {
                sb.append("");
            } else {
                char[] crr = arr[i].toCharArray();
                if (Character.isDigit(crr[0])) {
                    sb.append(crr[0]);
                } else {
                    sb.append(Character.toUpperCase(crr[0]));
                }
                for (int j = 1; j < crr.length; j++) {
                    sb.append(Character.toLowerCase(crr[j]));
                }
            }

            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}