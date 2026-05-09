class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int c=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int ans=nums[i]+nums[j]+nums[k];
                    int s=Math.abs(target-(nums[i]+nums[j]+nums[k]));
                    if(s==0) { return target;}
                    if(c>s) {sum=ans; c=s;}
                }
            }
        }
        return sum;
    }
}