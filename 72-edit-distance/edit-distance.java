class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++) Arrays.fill(dp[i],-1);
       return getstep(word1.length()-1,word2.length()-1,word1,word2,dp);
    }
    private int getstep(int i,int j,String word1, String word2,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(word1.charAt(i) == word2.charAt(j)) return dp[i][j]=getstep(i-1,j-1,word1,word2,dp);
        else return dp[i][j]=1+Math.min(getstep(i,j-1,word1,word2,dp),Math.min(getstep(i-1,j,word1,word2,dp),getstep(i-1,j-1,word1,word2,dp)));
    }
}