// x, y 축 
//-1, 0
//-1, +1
//-2, +1
//-3, +1
//-4, +1
//-5, +1
//2개 생략
//-5, +2
//순서쌍이 겹치지 않으면 카운트
//순서쌍이 리스트 형태로 들어와야함. 2차원배열 int [][] arr2d = new int[][]
//가변으로 들어와야 하니까 컬렉터로
// 
import java.util.*;

class Solution {
    
    public int solution(String dirs) {
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        
        for(char d : dirs.toCharArray()) {
            
            int nx = x;
            int ny = y;
            
            if(d == 'U') ny++;
            else if(d =='D') ny--;
            else if(d =='R') nx++;
            else if(d =='L') nx--;
            
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;
            
            String path1 = x + "," + y + "->" + nx + "," + ny;
            String path2 = nx + "," + ny + "->" + x + "," + y;

            set.add(path1);
            set.add(path2);

            x = nx;
            y = ny;
        }

        return set.size() / 2;
    }
}
            
    