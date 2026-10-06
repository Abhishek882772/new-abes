class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Character> st=new Stack<>();
        int count=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(s.charAt(i));
            else{
                int ans=1;
                if(st.size()==1){st.pop(); count++;}
                else if(st.size()>1){ 
                    for(int k=1;k<st.size();k++){
                        ans*=2;
                    }
                    count=count+ans;
                    while(i<s.length() && st.size()>0 && s.charAt(i) == ')'){ st.pop(); i++;}
                    i--;
                    }
            }
        }   
        return count;
    }
}