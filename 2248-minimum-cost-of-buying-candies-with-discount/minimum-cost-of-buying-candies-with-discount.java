class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int i=cost.length/3;
        int j=cost.length-1;
        int money=0;
        while(i>0){
            money+=cost[j];
            j--;
            money+=cost[j];
            j=j-2;
            i--;
        }
        while(j>=0) {
            money+=cost[j];
            j--;
        }
        return money;
    }
}