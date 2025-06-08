import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++) {
            String word1 = sc.next();
            String word2 = sc.next();
            
            char[] chars1 = word1.toCharArray();
            char[] chars2 = word2.toCharArray();
     
            if(chars1.length != chars2.length) {
                System.out.printf("%s & %s are NOT anagrams.\n", word1, word2);
                continue;
            }
        
            Arrays.sort(chars1);
            Arrays.sort(chars2);
        
            boolean isAnagram = true;
            for(int j = 0; j < chars1.length; j++) {
                if(chars1[j] != chars2[j]) {
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram) {
                System.out.printf("%s & %s are anagrams.\n", word1, word2);
            }
            else {
                System.out.printf("%s & %s are NOT anagrams.\n", word1, word2);
            }
        }
        
        sc.close();
    }
}
