class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2 || s==null){
            return s;
        }
        int start=0,maxlen=1;
        for(int i=0;i<s.length();i++){
        int len1=maxlength(s,i,i);
        int len2=maxlength(s,i,i+1);
        int ans=Math.max(len1,len2);
        if(ans>maxlen){
            maxlen=ans;
            start=i-(ans -1)/2;
        }
        }
        return s.substring(start,start+maxlen);
    }

    private int maxlength(String start,int left,int right){
        while(left>=0 && right<start.length() && start.charAt(left)==start.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}