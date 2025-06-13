import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = sc.nextInt();
       // String [] input = new String[n];

        for(int i = 0; i < n; i++) {
           
            String name = sc.next();
            String info = sc.next();

           // name = input[0];
           // info = input[1];
      
            if(info.equals("enter")) {
                set.add(name);
            }
            else {
                set.remove(name);
            }
        }

       List<String> list = new ArrayList<>(set);
       Collections.sort(list, Collections.reverseOrder());

       for(String s : list) {
           System.out.println(s);
       }
    }
}
    