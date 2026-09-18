class Solution {
    public boolean isBalanced(String num) {
        int odd=0;
        int even=0;
        for(int i=0;i<num.length();i=i+2){
            even+=num.charAt(i)-'0';
            if(i+1<=num.length()-1)odd+=num.charAt(i+1)-'0';
        }
        return even==odd;
    }
}