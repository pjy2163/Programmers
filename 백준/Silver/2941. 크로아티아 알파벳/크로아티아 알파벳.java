import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int i = 0;
        int len = a.length();
        int count = 0;
        
        while(i < len) {
            if(i + 2 < len && (a.substring(i, i+3).equals("dz="))) {
                count += 1;
                i += 3;
            }
            else if(i + 1 < len && (a.substring(i, i+2).equals("c=") ||
                    a.substring(i, i+2).equals("c-") || 
                    a.substring(i, i+2).equals("d-") || 
                    a.substring(i, i+2).equals("lj") || 
                    a.substring(i, i+2).equals("nj") || 
                    a.substring(i, i+2).equals("s=") || 
                    a.substring(i, i+2).equals("z="))) {
                 count += 1;
                 i += 2;
            }
            else {
                count += 1;
                i ++;
            }
        }
        System.out.print(count);
    }
}