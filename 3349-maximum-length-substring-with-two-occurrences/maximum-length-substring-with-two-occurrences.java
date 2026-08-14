class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0; int j=0;
        int count=0; int mc=0;
        int[] arr=new int[26];
        while(i<s.length()){
            arr[s.charAt(i)-'a']++;
            count++;
            if(arr[s.charAt(i)-'a'] <= 2) mc=Math.max(mc,count);
            while(arr[s.charAt(i)-'a']>2){
                arr[s.charAt(j)-'a']--;
                count--;
                j++;
            }
            i++;
        }
        return mc;
    }
}