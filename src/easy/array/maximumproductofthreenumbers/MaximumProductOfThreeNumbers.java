package easy.array.maximumproductofthreenumbers;

/**
 * MaximumProductOfThreeNumbers
 *
 * @author john 2020/5/25
 */
public class MaximumProductOfThreeNumbers {
    class Solution {
        public int maximumProduct(int[] nums) {
            short max1, max2, max3, min1, min2;
            max1 = max2 = max3 = Short.MIN_VALUE;
            min1 = min2 = Short.MAX_VALUE;
            for (int num : nums) {
                if (num > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = (short) num;
                } else if (num > max2) {
                    max3 = max2;
                    max2 = (short) num;
                } else if (num > max3) {
                    max3 = (short) num;
                }
                if (num < min1) {
                    min2 = min1;
                    min1 = (short) num;
                } else if (num < min2) {
                    min2 = (short) num;
                }
            }
            if (min1 > 0 || min2 > 0) {
                return max1 * max2 * max3;
            } else {
                return Math.max(max1 * max2 * max3, max1 * min1 * min2);
            }
        }
    }
}