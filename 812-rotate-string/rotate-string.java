class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int j=0;
        boolean ans=false;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            int l=n-i;
            if(goal.substring(i,n).equals(s.substring(0,l)) && goal.substring(0,i).equals(s.substring(l,n))) ans=true;
        }
        return ans;
    }
}