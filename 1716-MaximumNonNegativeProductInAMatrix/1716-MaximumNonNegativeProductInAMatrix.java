// Last updated: 5/25/2026, 4:27:32 PM
class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        long[][][] dp = new long[m][n][2]; // [max, min]
        
        dp[0][0][0] = grid[0][0];
        dp[0][0][1] = grid[0][0];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                
                if(i == 0 && j == 0) continue;
                
                long max = Long.MIN_VALUE;
                long min = Long.MAX_VALUE;

                if(i > 0){
                    long a = dp[i-1][j][0] * grid[i][j];
                    long b = dp[i-1][j][1] * grid[i][j];
                    
                    max = Math.max(max, Math.max(a, b));
                    min = Math.min(min, Math.min(a, b));
                }

                if(j > 0){
                    long a = dp[i][j-1][0] * grid[i][j];
                    long b = dp[i][j-1][1] * grid[i][j];
                    
                    max = Math.max(max, Math.max(a, b));
                    min = Math.min(min, Math.min(a, b));
                }

                dp[i][j][0] = max;
                dp[i][j][1] = min;
            }
        }

        long res = dp[m-1][n-1][0];
        
        if(res < 0) return -1;
        
        return (int)(res % 1_000_000_007);
    }
}