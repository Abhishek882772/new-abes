class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curr=nums[0];
        int mx=nums[0];
        int curr1=nums[0];
        int mn=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(curr+nums[i],nums[i]);
            mx=Math.max(mx,curr);
            curr1=Math.min(curr1+nums[i],nums[i]);
            mn=Math.min(mn,curr1);
            total+=nums[i];
        }
        if(mx<0) return mx;
        else return Math.max(mx,total-mn);
    }
}