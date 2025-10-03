class Solution {
    boolean solution(String s) {
      
        int count = 0;
        s = s.toUpperCase();
        
        for (char c : s.toCharArray()) {
            if(c == 'P') {
                count++;
            }
            
            else if (c == 'Y') {
                count--;
            }
        }
        
        boolean answer = false;
        
        if (count == 0) {
            answer = true;
        }
     
        return answer;
    }
}