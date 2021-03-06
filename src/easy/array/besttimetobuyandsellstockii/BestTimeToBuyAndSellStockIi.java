package easy.array.besttimetobuyandsellstockii;

/**
 * BestTimeToBuyAndSellStockIi
 *
 * @author john 2020/4/25
 */
public class BestTimeToBuyAndSellStockIi {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length <= 1) {
                return 0;
            }
            int max = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    max += prices[i] - prices[i - 1];
                }
            }
            return max;
        }
    }
}