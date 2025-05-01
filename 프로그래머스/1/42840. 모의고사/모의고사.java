//1번 -> 12345
//2번 -> 21 23 24 25
//3번 -> 33 11 22 44 55 
//완전 탐색. 
//1,2,3번 모두 배열에 담기
//시작하는 번호가 다 다르므로 if문으로 비교
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {2,1,2,3,2,4,2,5};
        int [] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i % arr1.length]) {
                count1++;
            }
             if(answers[i] == arr2[i % arr2.length]) {
                count2++;
            }
             if(answers[i] == arr3[i % arr3.length]) {
                count3++;
            }
        }
         int max = Math.max(count1, Math.max(count2, count3));
        if (count1 == max) answer.add(1);
        if (count2 == max) answer.add(2);
        if (count3 == max) answer.add(3);
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}