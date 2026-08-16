class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount +1];
        for(int i=0;i<dp.length;i++)Arrays.fill(dp[i], -1);
        int ans= gettheno(coins,amount,coins.length-1,dp);
        return ans >=100000000?-1:ans;
    }
    private int gettheno(int[] coins, int amount,int i,int[][] dp){
        if(amount==0) return 0;
        if(i<0) return 100000000;
        if(dp[i][amount] != -1)return dp[i][amount];
        if(coins[i] > amount) return gettheno(coins,amount,i-1,dp); 
            int nott=0+gettheno(coins,amount,i-1,dp);
            int take= 1+gettheno(coins,amount-coins[i],i,dp);
            return dp[i][amount]= Math.min(take,nott);
    }
}