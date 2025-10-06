import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
     
        for(int tc = 0; tc < t; tc++) {
             StringTokenizer st = new StringTokenizer(br.readLine());
             int n = Integer.parseInt(st.nextToken());
             int m = Integer.parseInt(st.nextToken());
             
             Queue<int[]> queue = new LinkedList<>();
             st = new StringTokenizer(br.readLine());
        
			       for(int i = 0; i < n; i++) {
				       int priority = Integer.parseInt(st.nextToken());
				       queue.offer(new int[]{i, priority});
				     }
				     
				     int count = 0;
				     
		      
             while (!queue.isEmpty()) {
            
	            int[] doc = queue.poll();
	            boolean hasHigher = false;
	          
		          for (int[] q : queue) {
				        if(q[1] > doc[1]) {
					        hasHigher = true;
					        break;
					       }
					      }
			      
				      if (hasHigher) {
						      queue.offer(doc);
						  } else {
								  count++;
								  if(doc[0] == m) {
									  sb.append(count).append("\n");
									  break;
									 } 
								}
						}
				}
				
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
    