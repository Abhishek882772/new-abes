class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=0;
        int ans=0;
        int n=nums.length;
        if(n%2==0) mid= (nums[n/2]+nums[n/2-1])/2;
        else mid= nums[n/2];
        for(int i:nums){
            ans+=Math.abs(mid-i);
        }
        return ans;
    }
}