import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<>();
    HashMap<Integer, String> map2 = new HashMap<>();
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
	    String name = sc.next();
	    map.put(name, i + 1);
	    map2.put(i + 1, name);
    }
    
    for (int i = 0; i < m; i++) {
		    String q = sc.next();
	    
		    if (Character.isDigit(q.charAt(0))) {
				    int num = Integer.parseInt(q);
				    System.out.println(map2.get(num));
		    } else {
			    System.out.println(map.get(q));
		    }
	   }
	 }     
}
