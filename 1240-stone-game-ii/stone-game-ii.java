class Solution {
    int n;
    int [][]dp;
    public int stoneGameII(int[] piles) {
     n = piles.length; 
     dp = new int[n][2*n];
     for(int i=0;i<n;i++){
        Arrays.fill(dp[i] , Integer.MIN_VALUE);
     }
     int diff= helper(0 , 1 , piles );
     int sum=0;
     for(int i=0;i<n;i++)sum+=piles[i];
     return (sum+diff)/2;
    }
    int helper(int idx, int m , int []piles){
        if(idx>=n)return 0;
        if(dp[idx][m]!=Integer.MIN_VALUE)return dp[idx][m];
        int max  =Integer.MIN_VALUE;
        int sum =0;
        for(int i=idx;i<idx+2*m && i<n;i++){
            sum+=piles[i];
            max = Math.max(sum - helper(i+1 , Math.max(m ,i+1- idx) , piles) , max);
        }
        return dp[idx][m] = max;
    }
}