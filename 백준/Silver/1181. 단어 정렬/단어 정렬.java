import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        
        List<String> list = new ArrayList<>(set);
        
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.length() != b.length()) {
                    return a.length() - b.length();
                }
                return a.compareTo(b);
            }
        });
        
        for (String word : list) {
            bw.write(word + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
