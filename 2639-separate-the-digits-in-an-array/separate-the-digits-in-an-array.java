class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder arr=new StringBuilder();
       
for(int x : nums)
    arr.append(x);

            
        int ans[]=new int[arr.length()];
        for(int i=0;i<arr.length();i++){
            int a=arr.charAt(i)-'0';
            ans[i]=a;
            
        }
        return ans;
    }
}