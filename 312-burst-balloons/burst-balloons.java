class Solution {
    public int maxCoins(int[] nums) {
        int[] num=new int[nums.length+2];
        num[0]=1;
        num[nums.length+1]=1;
        int[][] dp=new int[nums.length+1][nums.length+1];
        for(int i=1;i<=nums.length;i++){
            num[i]=nums[i-1];
        }
        return burstballoons(num,1,nums.length,dp);
    }
    private int burstballoons(int[] num,int i,int j,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        int min=Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            int t= num[i-1]*num[k]*num[j+1] + burstballoons(num,i,k-1,dp) + burstballoons(num,k+1,j,dp);
            min=Math.max(min,t);
            dp[i][j]=min;
        }
        return dp[i][j];
    }
}