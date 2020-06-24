package easy.dynamicprogramming.climbingstairs;

/**
 * ClimbingStairs
 *
 * @author john 2020/6/24
 */
public class ClimbingStairs {
    class Solution {
        public int climbStairs(int n) {
            if (n <= 3) {
                return n;
            }
            int a = 1, b = 2, c = a + b;
            for (int i = 4; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            return a + b;
        }
    }
}