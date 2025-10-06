import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
       
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int start = 1;
     
        for(int i = 0; i < n; i++) {
		       int target = arr[i];
        
            while (start <= target) {
	            stack.push(start);
	            sb.append("+\n");
	            start++;
	          }
	         
			        if(stack.peek() == target) {
				        stack.pop();
				        sb.append("-\n");
				      }
			      
				      else {
					      System.out.print("NO");
					      return;
				      }
				   
				}
				
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
