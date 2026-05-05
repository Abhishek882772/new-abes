class Solution {
    public int reverse(int x) {
        if(x> Math.pow(2,31)-1 || x< -1*Math.pow(2,31)) return 0;
        long ans=0;
        while(x>0 || x*(-1)>0){
            int n=x%10;
            x=x/10;
            ans=ans*10;
            ans=ans+n;
        }
        if(ans > Math.pow(2,31)-1 || ans < -1*Math.pow(2,31)) return 0;
        return (int) ans;
    }
}