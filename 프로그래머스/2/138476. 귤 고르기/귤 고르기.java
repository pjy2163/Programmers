import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
       
        int len = tangerine.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            int size = tangerine[i];
            map.put(size, map.getOrDefault(size,0) + 1);
            }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b) -> b.getValue() - a.getValue());
         int answer = 0;
        
        for(Map.Entry<Integer, Integer> entry : entryList) {
            int count = entry.getValue();
            if(k <= 0){
                break;
            }
            k -= count;
            answer++;
            if(k <= 0){
                break;
            }
            
        }
        
        return answer;
    }
}