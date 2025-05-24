import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int answer = 0; // 시간
        int totalWeight = 0;
        int idx = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (idx < truck_weights.length || totalWeight > 0) {
            answer++; 

            totalWeight -= bridge.poll(); 

            if (idx < truck_weights.length) {
                int nextTruck = truck_weights[idx];

                if (totalWeight + nextTruck <= weight) {
                    bridge.add(nextTruck);  
                    totalWeight += nextTruck;
                    idx++;                  
                } else {
                    bridge.add(0);             
                }
            } else {
                bridge.add(0); 
            }
        }

        return answer;
    }
}
