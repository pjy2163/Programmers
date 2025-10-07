import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
    Stack<Integer> stack = new Stack<>();
    int len = prices.length;
    int[] answer = new int[len];
   
    for (int i = 0; i < len; i++) {
        int target = prices[i];
		  
		while (!stack.isEmpty() && target < prices[stack.peek()]) {
	        int idx = stack.pop();
			answer[idx] = i - idx;
        }
			
		stack.push(i);
    }
        
    while (!stack.isEmpty()) {
        int idx = stack.pop();
	    answer[idx] = len - idx - 1;
    }
    
    return answer;

	}
}
