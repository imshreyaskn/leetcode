// Last updated: 5/25/2026, 4:27:56 PM
class Solution {
    public int fib(int n) {
        int[] dp = new int[31];

        if(n==1) return 1;
        if(n==0) return 0;

        if(dp[n]!= 0) return dp[n];

        dp[n] = fib(n-1) + fib(n-2);

        return dp[n];

    }
}