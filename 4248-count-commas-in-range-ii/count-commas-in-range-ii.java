class Solution {
    public long countCommas(long n) {
        long start=1000;
        long coma=1;
        long ans=0;
        while(n>=start){
        long last= start*1000-1;
        long end=Math.min(last,n);
        ans+= (end-start+1)*coma;
        start*=1000;
        coma++;
        }
        return ans;
    }
}