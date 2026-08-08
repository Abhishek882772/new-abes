class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int total1=0;
        int i=0;
        int ans=0;
        int zeror=0;
        int zerol=0;
         while(i<s.length()){ 
            if(s.charAt(i)=='0'){
            zerol++;
            i++;
            }
            else{
                while(i<s.length() && s.charAt(i)=='1'){ 
                total1++;
                i++;}
                while(i<s.length() && s.charAt(i)=='0'){
                    zeror++;
                    i++;
                }
            
            if(zerol!=0 && zeror!=0) ans=Math.max(ans,zerol+zeror);
            zerol=zeror;
            zeror=0;
            }
        }
        return ans+total1;
    }
}