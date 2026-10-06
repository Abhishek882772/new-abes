class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(s.charAt(i));
            if(s.charAt(i)==')' && st.size()>0 && st.peek()=='(') st.pop();
            else if(s.charAt(i)==')') st.push(')');
        }
        return st.size();
    }
}