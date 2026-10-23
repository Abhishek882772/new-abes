class Solution {
    public int sortPermutation(int[] nums) {
        int[] copy=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i) copy[i]=1;
            if(k==0 && nums[i]!=i) k=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(copy[i]==0) k=k&nums[i];
        }
        return k;
    }
}