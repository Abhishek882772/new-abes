class Solution {
    public int[] pivotArray(int[] nums, int p) {
        int[] ans=new int [nums.length];
        int j=0;
        int k=nums.length-1;
        int l=k;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<p) {
                ans[j]=nums[i];
                j++;
                count++;
            }
            if(nums[k-i]>p) {
                ans[l]=nums[k-i];
                l--;
                count++;
        }
        }
        while(count<nums.length) {
                ans[j]=p;
                j++;
                count++;
        }
        return ans;
    }
}