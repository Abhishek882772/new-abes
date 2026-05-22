class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet <String> map=new HashSet<>();
        int len=0;
        for(int num:arr1){
            String s=String.valueOf(num);
            for(int j=1;j<=s.length();j++){
                map.add(s.substring(0,j));
            }
        }
        for(int num:arr2){
            String s=String.valueOf(num);
            for(int j=1;j<=s.length();j++){
               if( map.contains(s.substring(0,j))) len=Math.max(len,j);
            }
        }
        return len;
    }
}