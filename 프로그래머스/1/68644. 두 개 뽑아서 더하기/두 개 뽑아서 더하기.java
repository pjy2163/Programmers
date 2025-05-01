//배열 인덱스 0부터 하나씩 더해서
//add -> 컬렉션 이용
//마지막에 Collection.sort(list);
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        
        int len = numbers.length;
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++){
                set.add(numbers[i] + numbers[j]);
            }   
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}