class Solution {
    public int missingInteger(int[] nums) {
        int n=nums[0]; int j=0; 
        // int c=0; int fc=0;
        // int sum=0;
         int fs=0;
        HashSet<Integer> set=new HashSet<>();
        // while(j<nums.length){
        //    if(nums[j]!=n){
        //     n=nums[j];
        //     c=0;
        //     sum=0;
        //    }
            while(j<nums.length && nums[j]==n){
                fs+=nums[j];
                j++;
                n++;
                // c++;
            }
            // if(fc<c){
            //     fc=c;
                // fs=sum;
            // }
            // }
            for(int k:nums){
                set.add(k);
            }
                while(set.contains(fs)){
                    fs++;
                }
        return fs;
    }
}