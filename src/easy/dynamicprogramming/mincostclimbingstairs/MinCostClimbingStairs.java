package easy.dynamicprogramming.mincostclimbingstairs;
/**
 * MinCostClimbingStairs
 * 
 * @author john 2020/7/29
 */
public class MinCostClimbingStairs {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int min1 = 0, min2 = 0;
            for (int value : cost) {
                int c = value + Math.min(min1, min2);
                min1 = min2;
                min2 = c;
            }
            return Math.min(min1, min2);
        }
    }
}