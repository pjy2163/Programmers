
import java.util.Scanner;

public class Main {
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        
        int maxHeight = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                maxHeight = Math.max(maxHeight, board[i][j]);
            }
        }
        
        int result = 0;
        
        for (int h = 0; h <= maxHeight; h++) {
             boolean[][] visited = new boolean[n][n];
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && board[i][j] > h) {
                        dfs(i, j, h, board, visited);
                        count++;
                    }
                }
            }
            result = Math.max(result, count);
        }
        
        System.out.println(result);
    }

    static void dfs(int x, int y, int h, int[][] board, boolean[][] visited) {
        
        int n = board.length;
        
        if (x < 0 || x >= n || y < 0 || y >= n) return;
        
        if (visited[x][y] || board[x][y] <= h) return;
        
        visited[x][y] = true;
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            dfs(nx, ny, h, board, visited);
        }
    }
}
