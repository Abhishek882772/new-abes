class Solution {
    public int numberOfSpecialChars(String word) {
        int cha=0;
        int[] upp=new int[26];
        int[] low=new int[26];
        for(char c:word.toCharArray()){
            if(c-'a'>=0 && low[c-'a']==0) low[c-'a']++;
            if(c-'A' >=0 && c-'A'<26) {if(low[c-'A'] >0) upp[c-'A']++;
            else upp[c-'A']=Integer.MIN_VALUE;
            }
            if(c-'a'>=0 && upp[c-'a']>0) upp[c-'a']=Integer.MIN_VALUE;
        }
        for(int i:upp){
            if(i>0) cha++;
        }
        return cha;
    }
}