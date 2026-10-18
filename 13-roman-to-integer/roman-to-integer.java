class Solution {
    public int romanToInt(String s) {
        int value=0;
        for(int i= s.length()-1;i>=0;i--){
            char c= s.charAt(i);
            if(c =='I'){
                value+=(value>=5?-1:1);
            }
            if(c =='V'){
                value=value+5;
            }
            if(c =='X'){
                value+=(value>=50?-10:10);
            }
            if(c =='L'){
                value=value+50;
            }
            if(c =='C'){
                value+=(value>=500?-100:100);
            }
            if(c =='D'){
                value+=500;
            }
            if(c =='M'){
                value+=1000;
            }
        }
        return value;
    }
}