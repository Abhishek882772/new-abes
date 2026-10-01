class Solution {
    public boolean isValid(String s) {
       Stack<Character> st=new Stack<>();
       for(char c:s.toCharArray()){
        if(c==')'){ if(st.isEmpty() || st.pop() != '(') return false;}
        else if(c=='}'){ if(st.isEmpty() || st.pop() != '{') return false;}
        else if(c==']'){ if(st.isEmpty() || st.pop() != '[') return false;}
        else st.push(c);
       }
       if(!st.isEmpty()) return false;
       return true;
    }
}