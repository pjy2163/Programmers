class Solution {
    public int solution(int n) {
        if(n == 1 ) return 1;
        if(n == 2 ) return 2; 
       
        int prev1 = 1;
        int prev2 = 2;
        int answer = 0;

        for(int i = 3; i <=n; i++){
           answer = (prev1 + prev2) % 1234567;
               prev1 = prev2;
                prev2 = answer;
             
            }
         return answer;
        }
}

    
