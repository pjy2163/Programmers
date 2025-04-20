class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while(!s.equals("1")) {
            int beforeLength = s.length();
            s = s.replaceAll("0", "");
            int afterLength = s.length();
            zeroCount += beforeLength - afterLength;
            
            s = Integer.toBinaryString(afterLength);
            count++;
            
        }
        int [] answer = new int[]{count, zeroCount};
        return answer;
    }
}