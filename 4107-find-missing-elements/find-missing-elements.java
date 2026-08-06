class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        List<Integer> list=new ArrayList<>();
        int[] arr=new int[max+1];
        for(int i:nums){
            arr[i]++;
        }
        for(int i=min;i<=max;i++){
            if(arr[i]==0) list.add(i);
        }
        return list;
    }
}