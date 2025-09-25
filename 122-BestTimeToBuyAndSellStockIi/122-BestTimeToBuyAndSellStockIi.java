// Last updated: 9/25/2025, 12:25:30 PM
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit=profit+(prices[i]-buyPrice);
                
            }
            buyPrice = prices[i];
            
            
        }

        return profit;
    }
}