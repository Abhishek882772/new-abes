class Solution {
    public long maxAlternatingSum(int[] nums) {
    for(int j=0;j<nums.length;j++) nums[j]=nums[j]*nums[j];
     Arrays.sort(nums);
     long sum=0;
     int i=0; int n=nums.length-1;
     for(int j=0;j<nums.length;j++){
        if(j%2==0) {sum+=(long)nums[n]; n--;}
        else {sum-=(long)nums[i]; i++;}    
     } 
     return sum;
    }
}