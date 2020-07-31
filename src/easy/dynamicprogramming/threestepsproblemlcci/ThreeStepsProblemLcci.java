package easy.dynamicprogramming.threestepsproblemlcci;

import java.util.Arrays;

/**
 * ThreeStepsProblemLcci
 *
 * @author john 2020/7/31
 */
public class ThreeStepsProblemLcci {
    class Solution {
        public int waysToStep(int n) {
            int[] dp = new int[]{1, 2, 4};
            if (n < 3) {
                return dp[n - 1];
            }
            for (int i = 4; i <= n; i++) {
                int tmp = ((dp[0] + dp[1]) % 1000000007 + dp[2]) % 1000000007;
                dp[0] = dp[1];
                dp[1] = dp[2];
                dp[2] = tmp;
            }
            return dp[2];
        }
    }
}