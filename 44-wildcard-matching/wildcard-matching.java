class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp=new boolean[s.length()][p.length()];
        boolean[][] vis=new boolean[s.length()][p.length()];
        return wildcard(s,p,s.length()-1,p.length()-1,dp,vis);
    }
    private boolean wildcard(String s, String p,int i,int j,boolean[][] dp,boolean[][] vis){
        if(i==-1 && j==-1) return true;
        if(j==-1) return false;
        
        if(i==-1 ){ 
            for(int k=0;k<=j;k++){
                if(p.charAt(k)=='*') continue;
                else return false;
            }
            return true;
        }
        if(vis[i][j]) return dp[i][j];
        vis[i][j]=true;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') return dp[i][j]= wildcard(s,p,i-1,j-1,dp,vis);
        else if(p.charAt(j)=='*') return dp[i][j]= wildcard(s,p,i-1,j,dp,vis) || wildcard(s,p,i,j-1,dp,vis);
        else dp[i][j]=false;
        return  dp[i][j];
    }
}