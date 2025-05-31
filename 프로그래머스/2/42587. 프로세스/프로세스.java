//1. 우선순위, 인덱스 저장
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
    
        int len = priorities.length;

        Queue<int[]> list = new LinkedList<>();
        
        for(int i = 0; i < len; i++) {
            list.add(new int[]{priorities[i], i});
        }
        int order = 0;
                     
        while(!list.isEmpty()) {
            int[] current = list.poll();
            boolean high = false;
            
            for(int[] doc : list) {
                if(doc[0] > current[0]) {
                    high = true;
                    break;
                }
            }
            if(high) {
                list.add(current);
            } 
            else {
                order++;
            
                if(current[1] == location) {
                    return order;
                }
            }
        }
        
        return -1;
    }
}