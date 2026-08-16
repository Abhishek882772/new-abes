class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        int INF=100000000;
        for(int i=0;i<coins.length;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=amount;i++){
            if(i % coins[0]==0) dp[0][i]=i/coins[0];
            else dp[0][i]=INF;
        }
        for(int i=1;i<coins.length;i++){
            for(int j=1;j<=amount;j++){
                int nott= dp[i-1][j];
                int take= INF;
                if(coins[i] <= j) take =1+dp[i][j-coins[i]];
                dp[i][j]=Math.min(take,nott);
            }
        }
        return dp[coins.length-1][amount]>=INF?-1:dp[coins.length-1][amount];
       }
}