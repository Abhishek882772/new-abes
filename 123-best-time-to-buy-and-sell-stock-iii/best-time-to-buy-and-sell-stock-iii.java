class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp=new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++){for(int j=0;j<2;j++) Arrays.fill(dp[i][j],-1);}
        return allowed(prices,2,1,0,dp);
    }
    private int allowed(int[] prices,int cap,int buy,int i,int[][][] dp){
        if(i==prices.length || cap==0) return 0;
        if(dp[i][buy][cap] != -1) return dp[i][buy][cap];
        if(buy ==1) dp[i][buy][cap]=Math.max((-prices[i])+allowed(prices,cap,0,i+1,dp), allowed(prices,cap,1,i+1,dp));
        else dp[i][buy][cap]=Math.max((prices[i])+allowed(prices,cap-1,1,i+1,dp), allowed(prices,cap,0,i+1,dp));
        return dp[i][buy][cap];
    }
}