class Solution {
    public int findNumberOfLIS(int[] nums) {
    int[] dp=new int[nums.length];
    Arrays.fill(dp,1);
    int[] count=new int[nums.length];
    Arrays.fill(count,1);
    int max=1;
    for(int i=1;i<nums.length;i++){
    for(int j=0;j<i;j++){
        if(nums[i]>nums[j]){
            if( dp[i] < dp[j]+1){
             dp[i]=dp[j]+1;
             count[i]=count[j];
        }
        else if( dp[i] == dp[j]+1){
        count[i]+=count[j];
        }
        }
    }
    max=Math.max(max,dp[i]);
    }
    int no=0;
    for(int i=0;i<nums.length;i++){
        if(dp[i]==max) no+=count[i];
    }
    return no;
    }
}