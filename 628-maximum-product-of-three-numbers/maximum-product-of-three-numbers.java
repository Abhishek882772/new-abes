class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int pos=nums[n-1]*nums[n-2]*nums[n-3]; 
       int neg=nums[0]*nums[1]*nums[2];
       int ans=Math.max(neg,pos);
       int p2=nums[0]*nums[n-1]*nums[n-2];
       ans=Math.max(ans,p2);
       int p1=nums[0]*nums[1]*nums[n-1];
       ans=Math.max(ans,p1);
       return ans;
    }
}