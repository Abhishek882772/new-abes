class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            boolean ans=false;
            if(i<10){
                if(i==2 || i==5 || i==6 || i==9) count++;
            }
            else{
                int j=i;
                while(j>0){
                    int a= j % 10;
                    j=j/10;
                    if(a == 3 || a==4 || a==7){
                        ans=false;
                         break;}
                    else if(a==2 || a==5 || a==6 || a==9) ans=true;
                    else continue;
                }
                if(ans == true) count++;
            }
        }
        return count;
    }
}