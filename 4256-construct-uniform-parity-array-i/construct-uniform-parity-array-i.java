class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0; int odd=0;
        for(int i:nums1){
            if(i%2==0) even++;
            else odd++;
        }
        if(odd==nums1.length || even==nums1.length) return true;
        return true;
    }
}