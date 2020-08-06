package easy.array.maximumproductoftwoelementsinanarray;

import java.util.Arrays;

/**
 * MaximumProductOfTwoElementsInAnArray
 * 
 * @author john 2020/8/6
 */
public class MaximumProductOfTwoElementsInAnArray {
    class Solution {
        public int maxProduct(int[] nums) {
            int max1 = Math.max(nums[0], nums[1]), max2 = Math.min(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] > max1) {
                    max2 = max1;
                    max1 = nums[i];
                } else if (nums[i] > max2) {
                    max2 = nums[i];
                }
            }
            return (max1 - 1) * (max2 - 1);
        }
    }
}