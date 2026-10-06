class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') open++;
            if(s.charAt(i)==')' && open>0 ) open--;
            else if(s.charAt(i)==')') ans++;
        }
        return open+ans;
    }
}