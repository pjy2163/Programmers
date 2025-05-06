class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        double answer = 0;
        int len = numbers.length;
        for(int i = 0; i < len; i++) {
            sum += numbers[i];
        }
        answer = (double) sum / len;
        return answer;
    }
}