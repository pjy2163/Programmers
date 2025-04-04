class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        int cnt = 0;
        
        if(len % 2 != 0) {
           return false;
        }
        
        if(s.charAt(0) != '(' || s.charAt(len-1) != ')') {
           return false;
        }
        
        for(int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            }
            else if (s.charAt(i) == ')'){
                cnt--;
            }
            if (cnt < 0){
               return false;
            }
        }
    if(cnt != 0 ) {
        return false;
    }
        return answer;
    }
}