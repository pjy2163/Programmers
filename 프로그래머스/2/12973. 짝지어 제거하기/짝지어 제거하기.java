import java.util.Stack;

class Solution
{
    public int solution(String s) {
       Stack<Character> stack = new Stack<>();
        
        char[] arr = s.toCharArray();
        
        for(char c : arr) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}