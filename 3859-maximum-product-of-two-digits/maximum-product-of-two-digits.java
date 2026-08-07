class Solution {
    public int maxProduct(int n) {
        Stack<Integer> st=new Stack<>();
        while(n>0){
            int i=n%10;
            n/=10;
            st.push(i);
        }
        Collections.sort(st);
        return st.pop()*st.pop();
    }
}