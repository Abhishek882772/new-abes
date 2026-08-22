class Solution {
    public boolean checkDivisibility(int n) {
        int c=n;
        int sum=0;
        int mul=1;
        while(n>0){
            int no=n%10;
            sum+=no;
            mul*=no;
            n/=10;
        }
        return (c%(mul+sum )== 0);
    }
}