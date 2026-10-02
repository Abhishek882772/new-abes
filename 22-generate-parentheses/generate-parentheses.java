class Solution {
    private void getli(int n, int open,int close,String s,List<String> li){
        if(s.length()==2*n)li.add(s);
        if(open<n) getli(n,open+1,close,s+"(",li);
        if(close<open) getli(n,open,close+1,s+")",li);
    }
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        getli(n,0,0,"",li);
        return li;
    }
}