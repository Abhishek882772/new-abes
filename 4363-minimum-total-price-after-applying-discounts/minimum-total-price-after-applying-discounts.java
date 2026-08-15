class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int j=discounts.length-1;
        int i=prices.length-1;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double ans=0;
        while(i>=0){
            if(j>=0){
                ans+=((prices[i]*(100.0-discounts[j]))/100.0);
                j--;
            }
            else ans+=prices[i];
            i--;
        }
        return ans;
    }
}