class Solution {
    public int sumCounts(List<Integer> nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.size();i++){
            map.clear();
            for(int j=i;j<nums.size();j++){
                map.put(nums.get(j),map.getOrDefault(nums.get(j),0)+1);
                ans+=Math.pow(map.size(),2);
            }
        }
        return ans;
    }
}