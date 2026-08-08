class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int total1=0;
        int i=0;
        int ans=0;
        int zeror=0;
        int zerol=0;
        int mid1=0;
         while(i<s.length()){ 
            if(s.charAt(i)=='1')total1++;
            i++;
         }
         i=0;
       while(i<s.length()){ 
        zerol=zeror;
        zeror=0;
        while(i<s.length() && s.charAt(i)=='1'){
            i++;
           
        }
        if(zerol==0){while(i<s.length() && s.charAt(i)=='0'){
            i++;
            zerol++;
        }}
        while(i<s.length() && s.charAt(i)=='1'){
            i++;
        }
         while(i<s.length() && s.charAt(i)=='0'){
            i++;
            zeror++;
        }
        while(i<s.length() && s.charAt(i)=='1'){
            i++;
        }
        if(zerol>0 && zeror>0) ans= Math.max(ans,total1+zerol+zeror);
        else ans=Math.max(ans,total1);
        }
        return ans;
    }
}