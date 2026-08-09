class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return getpath(0,0,m,n,dp);
    }
    private int getpath(int i,int j,int m,int n, int[][] dp){
        if(i==m-1 && j==n-1) return 1;
        if(i<0 || j<0 || i>m-1 || j>n-1) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        int left=getpath(i+1,j,m,n,dp);
        int right=getpath(i,j+1,m,n,dp);
        dp[i][j]=left+right;
        return dp[i][j];
    }
}