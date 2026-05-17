class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0) return true;
        boolean[] bool=new boolean[arr.length];
        return giveindex(arr,start,bool);
    }
    private boolean giveindex(int[] arr,int start,boolean[] bool){
        if(arr[start]==0) return true;
        if(bool[start]) return false;
        bool[start]=true;
           if(start+arr[start]<arr.length) if (giveindex(arr,start+arr[start], bool)) return true;
           if(start-arr[start]>=0) if (giveindex(arr,start-arr[start], bool)) return true;
        return false;
    }
}