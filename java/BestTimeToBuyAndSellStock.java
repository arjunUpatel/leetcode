public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[minIndex])
                minIndex = i;
            int profit = prices[i] - prices[minIndex];
            if (profit > maxProfit)
                maxProfit = profit;
        }
        return maxProfit;
    }
}
