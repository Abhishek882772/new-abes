class Solution {
    public String smallestPalindrome(String s) {
       String s1=s.substring(0,s.length()/2);
       char[] arr=s1.toCharArray();
       char ch=s.charAt(s.length()/2);
       Arrays.sort(arr);
       StringBuilder sb=new StringBuilder();
       String s3= new String(arr);
       sb.append(s3);
       if(s.length()%2!=0)sb.append(ch);
       StringBuilder sb1=new StringBuilder(s3);
       sb1.reverse();
       String s4=sb1.toString();
       sb.append(s4);
       return sb.toString();
        }
}