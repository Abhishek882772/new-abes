class Solution {
    public String smallestPalindrome(String s) {
        int[] arr=new int[26];
        int n=s.length()/2;;
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            while(arr[i]>0){
                char c=(char)(97+i);
                sb.append(c);
                arr[i]--;
            }
        }
        if(s.length()%2!=0) sb.append(s.charAt(s.length()/2));
        if(s.length()%2==0)n=sb.length();
        else n=sb.length()-1;
        for(int i=n-1;i>=0;i--){
            sb.append(sb.charAt(i));
        }
        return sb.toString();
        }
}