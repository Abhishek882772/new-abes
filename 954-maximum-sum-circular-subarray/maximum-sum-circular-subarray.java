class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMin=0;
        int minSum=nums[0];

        int currMax=0;
        int maxSum=nums[0];
        int total=0;

        for(int num:nums){
            total+=num;
            currMax=Math.max(num, num+currMax);
            maxSum=Math.max(maxSum, currMax);

            currMin=Math.min(num, num+currMin);
            minSum=Math.min(minSum, currMin);
        }
        if(maxSum<0){
            return maxSum;
        }
        return Math.max(maxSum, total-minSum);

        
    }
}