class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int c=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                    int ans=nums[i]+nums[j]+nums[k];
                    int s=Math.abs(target-(nums[i]+nums[j]+nums[k]));
                    if(c>s) {sum=ans; c=s;}
                    if(ans>target) k--;
                    else if(ans<target) j++;
                    else return ans;
            }
        }
        return sum;
    }
}