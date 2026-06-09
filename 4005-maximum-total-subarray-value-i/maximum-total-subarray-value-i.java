class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;
        for(long n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        return k*(max-min);
    }
}