class Solution {
    public int earliestFinishTime(int[] landS, int[] landD, int[] waterS, int[] waterD) {
     int min1=Integer.MAX_VALUE;
     int min2=Integer.MAX_VALUE;
     int ans=Integer.MAX_VALUE;
     for(int i=0;i<landS.length;i++){
        min1=Math.min(min1,landS[i]+landD[i]);
      }
      for(int i=0;i<waterS.length;i++){
        if(min1>waterS[i]) ans=Math.min(ans,min1+waterD[i]);
        else ans=Math.min(ans,waterS[i]+waterD[i]);
        min2=Math.min(min2,waterS[i]+waterD[i]);
      }
      for(int i=0;i<landS.length;i++){
        if(min2>landS[i]) ans=Math.min(ans,min2+landD[i]);
        else ans=Math.min(ans,landS[i]+landD[i]);
      }
      return ans;
    }
}