class Solution {
    public String maxSumOfSquares(int num, int sum) {
       StringBuilder sb=new StringBuilder();
       if(sum==0 || sum>num*9) return sb.toString();
       int no=sum/9;
       num-=no;
       sum=sum%9;
       while(no>1){
        sb.append("99");
        no=no-2;
       }
       if(no==1) sb.append("9");
       if(num>0 && sum>0){sb.append(sum);
       num--;}
        while(num>9){ sb.append("0000000000"); num-=10;}
        for(int i=0;i<num;i++) sb.append("0");
        return sb.toString();
    }
}