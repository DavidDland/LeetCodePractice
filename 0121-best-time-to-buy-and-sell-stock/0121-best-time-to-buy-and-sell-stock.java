class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int minPrice = prices[0]; // Initialize minPrice to the first price.
        int maxProfit = 0; // Initialize maxProfit to 0.
        
        for (int i = 1; i < prices.length; i++) {
            // If the current price is lower than minPrice, update minPrice.
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Otherwise, calculate the profit if we sell at the current price.
                int profit = prices[i] - minPrice;
                // Update maxProfit if the calculated profit is higher.
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit;
    }
}