class Solution {
    public int distinctSubseqII(String s) {
        int n=s.length();
        int M=1000000007;
        int[] dp=new int[n+1];
        int[] last=new int[26];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            char c=s.charAt(i-1);
            dp[i]=(2*dp[i-1])%M;
            dp[i]= (dp[i]-last[c-'a'] +M)%M;
            last[c-'a']= dp[i-1];
        }
        return (dp[n]-1 +M) % M;
    }

}