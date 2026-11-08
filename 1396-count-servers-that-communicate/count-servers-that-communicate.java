class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) {if(isvisited(grid,i,j,n,m)) count++;}
            }
        }
        return count;
    }
    private boolean isvisited(int[][] grid,int i,int j,int n,int m){
        for(int k=0;k<n;k++){
            if(k!=i && grid[k][j]==1) return true;
        }
        for(int k=0;k<m;k++){
            if(k!=j && grid[i][k]==1) return true;
        }
        return false;
    }
}