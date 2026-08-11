class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;int coun=0;
        HashMap<Integer,Integer> map=new HashMap<>();
map.put(0,1);
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(map.containsKey(sum-k)){
            coun+=map.get(sum-k);
        }
        map.putIfAbsent(sum,0);
        map.put(sum,map.get(sum)+1);
       }
       return coun;
    }
}