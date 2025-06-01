class Solution {
    public String[] solution(String[] names) {
        int len = names.length;
        int size = (len + 4) / 5;
        
        
        String[] answer = new String[size];
        
        int cnt = 0;
        for(int i = 0; i < len; i++) {
            if(i % 5 == 0) {
                answer[cnt] = names[i];
                cnt++;
            }
        }
        return answer;
    }
}