class Solution {
    public int closedIsland(int[][] grid) {
        int island=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) continue;
                if(grid[i][j]==0 ){ if(valid(grid,i,j)) island++; };
            }
        }
        return island;
    }
    private boolean valid(int[][] grid,int i,int j){
        int n=grid.length;
        int m=grid[0].length; 
        if(i<0 || i>n-1 || j<0 || j>m-1) return false;
        if(grid[i][j]==1) return true;
        grid[i][j]=1;
        boolean down= valid(grid,i+1,j);
        boolean up= valid(grid,i-1,j);
        boolean left= valid(grid,i,j-1);
        boolean right= valid(grid,i,j+1);
        return up && down && left && right;
    }
}