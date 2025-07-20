import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Number {
    int num;
    int index;

    public Number(int num, int index) {
        this.num = num;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] number = new Number[n];
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            int index = i;

            number[i] = new Number(num, index);
        }
        
    

        Comparator<Number> numAsc = (a, b) -> a.num - b.num;

        Arrays.sort(number, numAsc);

        for (int i = 0; i < n; i++) {
            result[number[i].index] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    
    }
}