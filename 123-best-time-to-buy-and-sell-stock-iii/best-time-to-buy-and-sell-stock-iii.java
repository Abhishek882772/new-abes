class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;               // also guards the dp[0][0][1] crash on empty input
        int[][][] dp = new int[n][2][3];
        dp[0][0][1] = -prices[0];
        dp[0][0][2] = -prices[0];
        for (int i = 1; i < n; i++) {
            for (int k = 1; k < 3; k++) {
                dp[i][0][k] = Math.max(-prices[i] + dp[i-1][1][k-1], dp[i-1][0][k]); // holding
                dp[i][1][k] = Math.max(prices[i]  + dp[i-1][0][k],   dp[i-1][1][k]); // sold
            }
        }
        return dp[n-1][1][2];
    }
}