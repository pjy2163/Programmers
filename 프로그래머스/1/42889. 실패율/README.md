# [level 1] 실패율 - 42889 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42889) 

다른 풀이 

int nPlayer = lastStages.length;
int [] nStagePlayers = new int[N + 2] 
-> 마지막 스테이지 클리어 하면 +1 값이 들어오게됨.
-> N + 1 배열이 필요하고, 인덱스는 0부터 시작하므로 N + 2 배열이 필요

for(int stage : lastStages) {
        nStagePlayers[stage] += 1;
}

Map<Integer, Double> fails = new HashMap<>();
-> 스페이지별 실패한 사용자 수 
double total = stages.length;

for(int i = 1; i <= N; i++) {
        if(nStagePlayers == 0) {
        fails.put(i,0.);
        }
        else {
        fails.put(i, nStagePlayers[i]/total);
        total -= nStagePlayers;
        }
}





