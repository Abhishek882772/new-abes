class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int sum=0;
        for(char c:s.toCharArray()){
            if(c=='(') ans++;
            if(c==')') ans--;
            sum=Math.max(sum,ans);
        }
        return sum;
    }
}