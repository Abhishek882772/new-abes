class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int count=0;
     int n=nums1.length;
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            map.put(nums1[i]+nums2[j],map.getOrDefault(nums1[i]+nums2[j],0)+1);
        }
     }
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int m=(nums3[i]+nums4[j]) *(-1);
           count+= map.getOrDefault(m,0);
        }
     }
     
     return count;
    }
}