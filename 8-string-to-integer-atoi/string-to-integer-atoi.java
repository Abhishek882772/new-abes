class Solution {
    public int myAtoi(String s) {
        int i=0;
        long np=0;
        boolean sign=true;
       while(i<s.length() && s.charAt(i)==' ') i++; 
       if(i<s.length() && s.charAt(i)=='-') {sign=false; i++;}
       else if(i<s.length() && s.charAt(i)=='+') i++;
       
       while(i<s.length() &&(s.charAt(i)-'0' >=0 && s.charAt(i)-'0' <=9 )){
        long get=s.charAt(i)-'0';
        i++;
        np*=10;
        np+=get;
        if(np >= 2147483647 && sign == true) return 2147483647;
        else if(np > 2147483647 && sign == false) return -2147483648;
       } 
       if(sign ==false) np*=(-1); 
       return (int)np;
    }
}