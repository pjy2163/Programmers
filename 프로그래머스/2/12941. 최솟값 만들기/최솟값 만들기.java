// 누적된 값이 최소. 값이 크면 더해야함.
import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B) {
        Arrays.sort(A); // 오름차순 정렬
        Arrays.sort(B);
        int len = A.length;
        int answer = 0; 
        
        for(int i = 0; i < len; i++){
             int c = A[i] * B[len - (i + 1)];
    
                 answer += c;
            }
                    
            return answer;
        }

        
    }
