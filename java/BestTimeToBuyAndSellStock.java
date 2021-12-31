public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int ptr = 0, lo = 0, hi = 0, maxProfit = 0;

        while (lo <= hi && ptr < prices.length) {
            if (prices[ptr] > prices[hi])
                hi = ptr;
            if (prices[ptr] < prices[lo]) {
                lo = ptr;
                if (hi < ptr)
                    hi = ptr;
            }
            if (maxProfit < prices[hi] - prices[lo])
                maxProfit = prices[hi] - prices[lo];
            ptr++;
        }
        return maxProfit;
    }
}
