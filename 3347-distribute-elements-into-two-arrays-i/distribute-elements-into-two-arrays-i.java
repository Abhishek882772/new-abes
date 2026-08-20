class Solution {
    public int[] resultArray(int[] nums) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        st1.push(nums[0]);
        st2.push(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(st1.peek()>st2.peek()) st1.push(nums[i]);
            else st2.push(nums[i]);
        } Stack<Integer> st3=new Stack<>();
        int[] arr=new int[nums.length];
        while(st1.size()>0){
            st3.push(st1.pop());
        }int i=0;
        while(st3.size()>0){
            arr[i]=st3.pop();
            i++;
        }
        while(st2.size()>0){
            st3.push(st2.pop());
        }
        while(st3.size()>0){
            arr[i]=st3.pop();
            i++;
        }
        return arr;
    }
}