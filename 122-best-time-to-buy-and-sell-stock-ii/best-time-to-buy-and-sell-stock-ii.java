class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++)Arrays.fill(dp[i],-1);
        return buystock(prices,0,1,dp);
    }
    private int buystock(int[] prices,int i,int buy,int[][]dp){
        if(i==prices.length) return 0;
        if(dp[i][buy] != -1) return dp[i][buy];
        if(buy==1){
            dp[i][buy]=Math.max((-prices[i])+buystock(prices,i+1,0,dp) , buystock(prices,i+1,1,dp));
        }
        else{
            dp[i][buy]=Math.max(prices[i]+buystock(prices,i+1,1,dp) , buystock(prices,i+1,0,dp));
        }
        return dp[i][buy];
    }
}