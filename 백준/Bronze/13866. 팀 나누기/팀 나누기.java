import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Integer[] nums = new Integer[4];
       
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            int pairSum = nums[i] + nums[3 - i];
            maxSum = Math.max(maxSum, pairSum);
            minSum = Math.min(minSum, pairSum);
        }

        System.out.print(maxSum - minSum);
    }
}
