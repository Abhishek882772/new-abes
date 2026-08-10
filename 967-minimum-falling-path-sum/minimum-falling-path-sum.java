class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0)  matrix[i][0]=matrix[i][0]+Math.min(matrix[i-1][0],matrix[i-1][1]);
                else if(j==m-1) matrix[i][m-1]=matrix[i][m-1]+Math.min(matrix[i-1][m-1],matrix[i-1][m-2]);
                else matrix[i][j]=matrix[i][j]+Math.min(matrix[i-1][j],Math.min(matrix[i-1][j-1],matrix[i-1][j+1]));
            }
        }
        int min=1000000;
        for(int i=0;i<m;i++){
            min=Math.min(min,matrix[n-1][i]);
        }
        return min;
    }
}