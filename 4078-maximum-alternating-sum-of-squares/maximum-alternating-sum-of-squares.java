class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr=new long[nums.length];
    for(int j=0;j<nums.length;j++) arr[j]=(long)Math.pow(nums[j],2);
     Arrays.sort(arr);
     long sum=0;
     int i=0; int n=nums.length-1;
     for(int j=0;j<nums.length;j++){
        if(j%2==0) {sum+=(long)arr[n]; n--;}
        else {sum-=(long)arr[i]; i++;}    
     } 
     return sum;
    }
}