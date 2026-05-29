class Solution {
    public int minElement(int[] nums) {
        int n=Integer.MAX_VALUE;
        for(int i:nums){
            int sum=0;
            while(i>0){
                sum+=i%10;
                i=i/10;
            }
            n=Math.min(n,sum);
        }
        return n;
    }
}