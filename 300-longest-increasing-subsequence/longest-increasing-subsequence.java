class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++) Arrays.fill(dp[i],-1);
        return getthe(nums,-1,0,dp);
    }
    private int getthe(int[] nums,int pre,int i,int[][] dp){
        if(i==nums.length) return 0;
        if(dp[i][pre+1] != -1) return dp[i][pre+1];
        int nottake=getthe(nums,pre,i+1,dp);
        int take=0;
        if(pre==-1|| nums[i]>nums[pre]){ take=1+ getthe(nums,i,i+1,dp);}
        
        
        return dp[i][pre+1]= Math.max(take,nottake);
    }
}