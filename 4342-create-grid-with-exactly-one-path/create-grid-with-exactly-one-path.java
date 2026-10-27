class Solution {
    public String[] createGrid(int m, int n) {
        String[] s=new String[m];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append('.');
        }
        s[0]=sb.toString();
        for(int i=1;i<m;i++){
         sb.setLength(0);
            for(int j=0;j<n-1;j++){
            sb.append('#');
            }
            sb.append('.');
            s[i]=sb.toString();
        }
        return s;
    }
}