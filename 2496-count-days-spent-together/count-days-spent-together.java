class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int As=getdate(arriveAlice,days);
        int Al=getdate(leaveAlice,days);
        int Bs=getdate(arriveBob,days);
        int Bl=getdate(leaveBob,days);
        int start=Math.max(As,Bs);
        int end=Math.min(Al,Bl);
        return Math.max(0,(end-start+1));

    }
    private int getdate(String date,int[] day){
        int days=Integer.parseInt(date.substring(3,5));
        int month=Integer.parseInt(date.substring(0,2));
        int ans=0;
        for(int i=0;i<month-1;i++){
            ans+=day[i];
        }
        ans+=days;
        return ans;
    }
}