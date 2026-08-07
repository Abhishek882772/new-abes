class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        int count=1;
        int i=0; int j=1;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int count1=1;
        if(intervals.length <=1 ) return intervals.length;
        while(j < intervals.length){
             if(intervals[i][0] <= intervals[j][0] && intervals[i][1] >= intervals[j][1] ){
                j++;
             }
             else{
                i=j;
                j++;
                count++;
             }
        }
       i=0; j=1;
       Arrays.sort(intervals,(a,b)->Integer.compare(b[1],a[1]));
       while(j < intervals.length){
             if(intervals[i][0] <= intervals[j][0] && intervals[i][1] >= intervals[j][1] ){
                j++;
             }
             else{
                i=j;
                j++;
                count1++;
             }
        }
        
        return Math.min(count,count1);
    }
}