class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c != ')') {
                st.push(c);
            } 
            else {

                StringBuilder sb = new StringBuilder();

                while (st.peek() != '(') {
                    sb.append(st.pop());
                }

                // Remove '('
                st.pop();

                // Put reversed content back
                for (int k = 0; k < sb.length(); k++) {
                    st.push(sb.charAt(k));
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}