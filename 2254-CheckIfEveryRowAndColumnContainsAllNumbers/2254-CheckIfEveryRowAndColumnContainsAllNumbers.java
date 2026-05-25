// Last updated: 5/25/2026, 4:27:11 PM
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            int[] row = new int[n+1];
            int[] col = new int[n+1];

            for(int j = 0; j < n; j++){
                
                // check row
                if(row[matrix[i][j]]++ > 0) return false;
                
                // check column
                if(col[matrix[j][i]]++ > 0) return false;
            }
        }

        return true;
    }
}