class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0) return true;
        int n=arr.length;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List<Integer> li=new ArrayList<>();
            if(arr[i]==0){
                li.add(0);
               }
            if(i+arr[i]<n) li.add(i+arr[i]);
            if(i-arr[i]>=0)li.add(i-arr[i]);
            list.add(li);
        }
        boolean[] bool=new boolean[arr.length];
        return giveindex(arr,start,list,bool);
    }
    private boolean giveindex(int[] arr,int start,List<List<Integer>> list,boolean[] bool){
        if(arr[start]==0) return true;
        if(bool[start]) return false;
        bool[start]=true;
        for(int i=0;i<list.get(start).size();i++){
            if (giveindex(arr,list.get(start).get(i), list, bool))
                return true;
        }
        return false;
    }
}