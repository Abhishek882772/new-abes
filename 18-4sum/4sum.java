class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==(long)target){ 
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        if(! list.contains(temp))list.add(temp);
                        k++; l--;
                        }
                    else if(sum<(long)target) k++;
                    else if(sum>(long)target) l--;
                }
            }
        }
        return list;
    }
}