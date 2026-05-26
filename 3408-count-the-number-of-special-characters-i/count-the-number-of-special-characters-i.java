class Solution {
    public int numberOfSpecialChars(String word) {
        int[] small=new int [26];
        int[] cap=new int [26];
        int ans=0;
        for(char c: word.toCharArray()){
            if(c-'A' <27) cap[c-'A']++;
            else small[c-'a'] ++;
        }
        for(int i=0;i<26;i++){
            if(small[i]!=0 && cap[i]!=0) ans++;
        }
        return ans;
    }
}