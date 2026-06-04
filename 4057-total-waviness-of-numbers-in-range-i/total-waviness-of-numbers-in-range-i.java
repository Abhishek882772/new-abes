class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num2 < 100) return 0;
        else if(num1<100 && num2>100)num1=100;
        int wave=0;
        for(int j=num1;j<=num2;j++){
            int i=j;
        int first=i%10;
        i=i/10;
        int mid=i%10;
        i=i/10;
        while(i>0){
        int second=i%10;
        i=i/10;
        if((mid > first && mid >second) || (mid<first && mid<second)) wave++;
        first=mid;
        mid=second;
        }
        }
        return wave;
    }
}