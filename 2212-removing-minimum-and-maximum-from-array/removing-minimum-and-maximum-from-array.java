class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int big=0;
        int small=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                big=i;
            }
            if(nums[i]<min){
                min=nums[i];
                small=i;
            }
        }
      if(big>small) return Math.min(small+1+nums.length-big,(Math.min(small+1+(big-small), nums.length-big+(big-small))));
      else   return Math.min(big+1+nums.length-small,(Math.min(big+1+(small-big), nums.length-small+(small-big))));
    }
}