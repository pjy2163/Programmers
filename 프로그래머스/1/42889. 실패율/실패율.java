//N : 전체 스테이지 개수
// int[] stages : 멈춰있는 스테이지 번호들
// 실패율 높은 스테이지를 내림차순으로 리턴하기
// 전체 5개 스테이지, 7명의 사용자. 
// 1 2 2 2 3 3 4 6 
// map으로 카운트
// 1수 / 8(배열의 개수)
// 2수(3) / 배열의개수 - (현재 스테이지 이전에 머물고 있는 사람들의 합 = 1수 + 2수)
// 2 / (8 - 4)
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int len = stages.length;
        
        Map<Integer, Integer> map = new HashMap<>();
       
        
        for(int i = 0; i < len; i++) {
            int currentStage = stages[i];
            map.put(currentStage, map.getOrDefault(currentStage,0) + 1);
        }
        
        List<double[]> failList = new ArrayList<>();
        int total = stages.length;
        
        for(int i = 1; i <= N; i++) {
            int failed = map.getOrDefault(i, 0);
            double failRate = total == 0 ? 0 : (double) failed / total;
            failList.add(new double[]{i, failRate});
            
            total -= failed;
        }
        failList.sort((a,b) -> {
            int cmp = Double.compare(b[1], a[1]);
            return cmp != 0 ? cmp : (int) (a[0] - b[0]);
        });
        
        int[] answer = new int[N];
        for(int i = 0; i < N; i++) {
            answer[i] = (int) failList.get(i)[0];
        }
        return answer;
    }
}