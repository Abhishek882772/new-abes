class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int max=0;
        for(int ni= -(n-1);ni<=n-1;ni++){
            for(int nj= -(n-1);nj<=n-1;nj++){
            int c=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+ni >=0 && i+ni <n && j+nj>=0 && j+nj < n){
                        if(img1[i][j]==1 && img2[i+ni][j+nj]==1) c++;
                    }
                }
            }
            max=Math.max(max,c);
            }
        }
        return max;
        
    }
}