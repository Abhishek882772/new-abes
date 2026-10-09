class Solution {
    public int minInsertions(String s) {
        Stack <Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') st.push(c);
            if(st.isEmpty()){count++; st.push('(');}
            if(c==')'){
                if(c==')') i++;
                if(i==s.length() || s.charAt(i)!=')') {count++; st.pop(); i--;}
                else if(i<s.length() && s.charAt(i)==')') st.pop();
            }
        }
            if(!st.isEmpty()) count+=st.size()*2;
            return count;
    }
}