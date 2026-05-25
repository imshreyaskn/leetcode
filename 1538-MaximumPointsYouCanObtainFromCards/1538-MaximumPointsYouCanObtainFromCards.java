// Last updated: 5/25/2026, 4:27:38 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int sum = 0;
        for(int i = 0; i<k; i++){
            sum+=cardPoints[i];
        }

        int max = sum; 
        for(int i = 0; i<k;i++){
            sum += cardPoints[n-i-1] - cardPoints[k-i-1];
            max = Math.max(max,sum);
        }

        return max;
    }
}