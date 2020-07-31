package easy.dynamicprogramming.themasseuselcci;

import java.util.Arrays;

/**
 * TheMasseuseLcci
 *
 * @author john 2020/7/31
 */
public class TheMasseuseLcci {
    class Solution {
        public int massage(int[] nums) {
            if (nums.length == 0) {
                return 0;
            } else if (nums.length == 1) {
                return nums[0];
            } else if (nums.length == 2) {
                return Math.max(nums[0], nums[1]);
            }
            int[] dp = {0, nums[0]};
            for (int i = 1; i < nums.length; i++) {
                int m = Math.max(dp[0] + nums[i], dp[1]);
                dp[0] = dp[1];
                dp[1] = m;
            }
            return Math.max(dp[0], dp[1]);
        }
    }
}