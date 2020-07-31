package easy.dynamicprogramming.contiguoussequencelcci;
/**
 * ContiguousSequenceLcci
 * 
 * @author john 2020/7/31
 */
public class ContiguousSequenceLcci {
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum = 0, max = nums[0];
            for (int num : nums) {
                sum += num;
                max = Math.max(max, sum);
                if (sum < 0) {
                    sum = 0;
                }
            }
            return max;
        }
    }
}