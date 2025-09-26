import java.util.*; 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String a = sc.next(); 
        a = a.toUpperCase();
        int[] count = new int[26];
        int MAX_VALUE = -1;
        char result = '?';
        
        for (char c : a.toCharArray()) {
            count[c - 'A']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > MAX_VALUE) {
                MAX_VALUE = count[i];
                result = (char)(i + 'A');
            } else if (count[i] == MAX_VALUE) {
                result = '?';
            }
        }
        
        System.out.println(result);
    }
}