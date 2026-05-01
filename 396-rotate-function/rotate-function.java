class Solution {
    public int maxRotateFunction(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        int sum=0;
        int total=0;
        for (int i = 0; i < n; i++) {
            sum+=nums[i]*i;
            total+=nums[i];
        }
            ans=Math.max(ans,sum);
        
        for(int j=1;j<n;j++){
            sum=sum-(nums[n-j]*n)+total;
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}