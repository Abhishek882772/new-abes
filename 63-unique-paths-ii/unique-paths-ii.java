class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
    int m=o.length;
    int n=o[0].length;
    if(o[m-1][n-1]==1 || o[0][0]==1) return 0;
        int[][] dp=new int[m][n];
        return getpath(0,0,m,n,dp,o);
    }
    private int getpath(int i,int j,int m,int n, int[][] dp,int[][] o){
        if(i==m-1 && j==n-1) return 1;
        if(i<0 || j<0 || i>m-1 || j>n-1 || o[i][j]==1) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        int left=getpath(i+1,j,m,n,dp,o);
        int right=getpath(i,j+1,m,n,dp,o);
        dp[i][j]=left+right;
        return dp[i][j];
    }
}