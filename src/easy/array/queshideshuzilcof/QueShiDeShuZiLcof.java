package easy.array.queshideshuzilcof;

/**
 * QueShiDeShuZiLcof
 *
 * @author john 2020/8/8
 */
public class QueShiDeShuZiLcof {
    class Solution {
        public int missingNumber(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i) {
                    return i;
                }
            }
            return nums.length;
        }
    }
}