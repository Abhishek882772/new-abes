class Solution {
    public String smallestSubsequence(String s) {
        int[] arr=new int[26];
        boolean[] vis=new boolean[26];
       Stack <Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:s.toCharArray()){
                arr[c-'a']--;
                if(vis[c-'a']) continue;
            while(!st.isEmpty() && arr[st.peek()-'a']>0 && st.peek()>c){
                vis[st.pop()-'a']=false;
            }
            st.push(c);
            vis[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}