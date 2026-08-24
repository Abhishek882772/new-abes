class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++) Arrays.fill(dp[i],-1);
        int ans=getthe(s,0,s.length()-1,dp)==0 ?1:getthe(s,0,s.length()-1,dp);
        return ans;
    }
    private int getthe(String s,int i,int j,int [][] dp){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j] !=-1) return dp[i][j];
        int take=0;
        if(s.charAt(i) == s.charAt(j)) take=2+ getthe(s,i+1,j-1,dp);
        int nottake=Math.max(getthe(s,i+1,j,dp),getthe(s,i,j-1,dp));
        return dp[i][j] = Math.max(take,nottake);
    }
}