class Solution {
    public int uniquePaths(int[][] grid) {
        int[][][] dp=new int [grid.length][grid[0].length][2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return path(grid,0,0,grid.length,grid[0].length,1,dp);
    }
    private int path(int[][] grid,int i,int j,int n,int m,int dir,int[][][] dp){
        if(i>=n || j>=m) return 0;
        if(i==n-1 && j==m-1) return 1;
        if(dp[i][j][dir]!=-1) return dp[i][j][dir]; 
        long ans=0;
        if(grid[i][j]==0){
            ans= (path(grid,i+1,j,n,m,1,dp)+(long)path(grid,i,j+1,n,m,0,dp))%1_000_000_007; //right
        }
        else{
            if(dir==1)  ans= path(grid,i,j+1,n,m,0,dp);
            else  ans= path(grid,i+1,j,n,m,1,dp);
        }
        return dp[i][j][dir]=(int)ans;
    }
}