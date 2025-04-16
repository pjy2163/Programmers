import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ", -1))); // 공백 보존
        StringBuilder answer = new StringBuilder();
        
        for (String word : list) {
            if (word.length() > 0) {
                char firstChar = word.charAt(0);
                if (Character.isLetter(firstChar)) {
                    word = Character.toUpperCase(firstChar) + word.substring(1).toLowerCase();
                } else {
                    word = firstChar + word.substring(1).toLowerCase();  
                }
            }
            answer.append(word).append(" ");
        }

        return answer.toString().substring(0, s.length()); 
    }
}
