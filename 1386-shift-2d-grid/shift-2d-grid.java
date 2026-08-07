class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
       int[] arr=new int[ n*m];
       int l=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[l]=grid[i][j];
            l++;
        }
       }
       int[] brr=new int[ n*m];
       for(int i=0;i<n*m;i++){
        brr[(i+k) % (n*m)]=arr[i];
       }
       l=0;
       List<List<Integer>> list =new ArrayList<>();
       List<Integer> li=new ArrayList<>();
       int p=0;
       for(int i=0;i<n*m;i++){
        
        if(p==m){
            p=0;
            list.add(li);
            li=new ArrayList<>();
        }
        li.add(brr[i]);
        p++;
       }list.add(li);
       return list;
    }
}