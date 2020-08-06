package easy.array.finalpriceswithaspecialdiscountinashop;

/**
 * FinalPricesWithASpecialDiscountInAShop
 *
 * @author john 2020/8/6
 */
public class FinalPricesWithASpecialDiscountInAShop {
    class Solution {
        public int[] finalPrices(int[] prices) {
            for (int i = 0; i < prices.length; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] <= prices[i]) {
                        prices[i] -= prices[j];
                        break;
                    }
                }
            }
            return prices;
        }
    }
}