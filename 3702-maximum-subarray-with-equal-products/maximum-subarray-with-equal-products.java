class Solution {
    public int maxLength(int[] nums) {
               int l=1;
       for(int i=0;i<nums.length;i++){
        int pro=1;
        int gcd=nums[i];
        int lcm=nums[i];
        for(int j=i;j<nums.length;j++){
            pro*=nums[j];
            gcd=gcd(gcd,nums[j]);
            lcm=lcm(lcm,nums[j]);
            if(pro== gcd*lcm) l=Math.max(l,(j-i+1));
        }
       } 
       return l;
    }
    private int gcd(int a,int b){
        while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            } 
        return a;
    }
    private int lcm(int a,int b){
        return (b/gcd(a,b))*a;
    }
}