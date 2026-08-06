class Solution {
    public int smallestNumber(int n, int t) {
        int m=n;
        int o=1;
        while(m!=0){
            o*=m%10;
            m/=10;
        }
        while(o%t != 0){
            n++;
            m=n;
            o=1;
            while(m!=0){
            o*=m%10;
            m/=10;
        }
        }
        return n;
    }
}