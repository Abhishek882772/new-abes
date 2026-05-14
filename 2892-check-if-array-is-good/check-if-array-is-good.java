class Solution {
    public boolean isGood(int[] nums) {
       int max=nums.length-1;
       int[] frr=new int [nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max || nums[i]<1) return false;
            frr[nums[i]-1] ++;
        }
        for(int i=0;i<frr.length-1;i++){
            if(frr[i] != 1) return false;
        }
        if(frr[frr.length-1] != 2) return false;
        return true;
    }
}