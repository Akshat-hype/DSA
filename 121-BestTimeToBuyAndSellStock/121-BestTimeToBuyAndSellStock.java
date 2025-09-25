// Last updated: 9/25/2025, 12:25:31 PM
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            if(profit< prices[i] - buyPrice){
                profit=prices[i]-buyPrice;
            }
            
        }

        return profit;        
    }
}