class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            int i=0;
            int j=s.length()-1;
            boolean b=false;
            for(int k=0;k<(j+1)/2;k++){
                if(s.charAt(k)!=s.charAt(j-k)) b=true;
            }
            if(!b) return s;
        }
        return "";
    }
}