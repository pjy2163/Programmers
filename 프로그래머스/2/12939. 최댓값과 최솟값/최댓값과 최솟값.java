class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        
        int len = num.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < len; i++) {
            int number = Integer.parseInt(num[i]);
            if(number <= min) {
                min = number;
            }
             if(number >= max) {
                 max = number;
             }
        }
            String answers = min + " " + max;
            return answers;
    }
   

}
