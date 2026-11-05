class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int count=0;
        for(int i:arr1){
            boolean ans=false;
            for(int j:arr2){
                if(Math.abs(i-j)<=d){ans=true; continue;}
            }
            if(ans==false) count++;
        }
        return count;
    }
}