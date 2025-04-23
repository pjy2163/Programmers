class Solution {
    public int solution(int n) {
        
        int count = Integer.bitCount(n);
        int next = n + 1;
        while(true) {
            if(Integer.bitCount(next) == count) {
                return next;
            }
            next++;
        }
        
    }
  
}