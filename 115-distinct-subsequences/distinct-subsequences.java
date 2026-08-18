class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++) Arrays.fill(dp[i],-1);
        return gettheno(s,t,0,0,dp);
    }
    private int gettheno(String s, String t,int i,int j,int[][] dp){
        if(j>=t.length()) return 1;
        if(i>=s.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=gettheno(s,t,i+1,j+1,dp)+gettheno(s,t,i+1,j,dp);
        }
        else return dp[i][j]=gettheno(s,t,i+1,j,dp);
         
    }
}