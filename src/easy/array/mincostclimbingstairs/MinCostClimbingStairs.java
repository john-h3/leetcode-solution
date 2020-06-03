package easy.array.mincostclimbingstairs;

/**
 * MinCostClimbingStairs
 *
 * @author john 2020/6/3
 */
public class MinCostClimbingStairs {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int cost1 = 0, cost2 = 0;
            for (int i = cost.length - 1; i >= 0; i--) {
                int c = cost[i] + Math.min(cost1, cost2);
                cost1 = cost2;
                cost2 = c;
            }
            return Math.min(cost1, cost2);
        }
    }
}