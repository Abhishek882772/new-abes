class Solution {
    int dp[][];
    public int longestPalindromeSubseq(String s) {
        dp=new int[s.length()][s.length()];
        for(int x[]:dp){
        Arrays.fill(x,-1);
        }
        return helper(0,s.length()-1,s);
    }

    int helper(int i,int j,String s){

        if(i==j){
           return 1;
        }
        if(i>j) return 0;
        int t=0;
        if(dp[i][j]!=-1){
          return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
        dp[i][j]=2+helper(i+1,j-1,s); 
        return dp[i][j];  
        }
        dp[i][j]=Math.max(helper(i+1,j,s),helper(i,j-1,s));
        return dp[i][j];
    }
}