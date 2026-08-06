class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int j=0;
        int i=nums[j];
        while(i<=nums[nums.length-1]){
            if(i!=nums[j]){
                list.add(i);
                i++;
            }else{
                j++; 
                i++;
            }
        }
        return list;
    }
}