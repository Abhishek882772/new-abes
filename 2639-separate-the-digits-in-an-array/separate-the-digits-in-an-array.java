class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> narr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int num=nums[i]%10;
                nums[i]/=10;
                narr.add(num);
            }
            for(int j=narr.size()-1;j>=0;j--){
                arr.add(narr.get(j));
            }
            narr.clear();
        }
        int [] list=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            list[i]=arr.get(i);
        }
        return list;
    }
}