class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] dp=new int[nums.length];
        int[] dp1=new int[nums.length];
        dp[0]=nums[0];
        dp1[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],nums[i]);
        }
        for(int i=nums.length-2;i>=0;i--){
            dp1[i]=Math.min(dp1[i+1],nums[i]);
        }
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(dp[i]-dp1[i] <= k){ ans=i; return ans;}
        }
        return ans;
    }
}