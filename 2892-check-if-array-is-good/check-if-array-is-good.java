class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        if(nums.length != nums[nums.length-1]+1) return false;
        if(nums[nums.length-1] != nums[nums.length-2]) return false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != i+1) return false;
        }
        return true;
    }
}