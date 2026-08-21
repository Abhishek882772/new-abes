class Solution {
    public int maxProfit(int[] prices) {
        int[] curr=new int[2];
        int[] next=new int[2];
        curr[1]=0;
        curr[0]=-prices[0];
        for(int i=1;i<prices.length;i++){
            next[0]=Math.max(curr[0], curr[1]-prices[i]);
            next[1]=Math.max(curr[1], curr[0]+prices[i]);
            curr[0]=next[0];
            curr[1]=next[1];
        }
        return curr[1];
    }
}