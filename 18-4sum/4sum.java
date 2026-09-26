class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                long sum = nums[i]+nums[j];
                int l = j+1;
                int r = nums.length-1;
                while(l!=j && r!=j && l<r){
                    long total = sum+nums[l]+nums[r];
                    if(total>target) r--;
                    else if(total<target) l++;
                    else{
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[l]);
                        li.add(nums[r]);
                        res.add(li);
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    }
                }
            }
        }
       return res;
    } 
}