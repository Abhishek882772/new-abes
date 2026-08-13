class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0; int count=0; int j=0; int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(i<nums.length){
            
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            c++;
            while(map.get(nums[i])>k){
                map.put(nums[j],map.get(nums[j])-1);
                j++;
                c--;
            }
            if(map.get(nums[i])<=k) count=Math.max(count,c);
            i++;
        }
        return count;
    }
}