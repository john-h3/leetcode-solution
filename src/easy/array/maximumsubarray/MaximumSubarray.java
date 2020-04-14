package easy.array.maximumsubarray;

/**
 * MaximumSubarray
 *
 * @author John 2020/4/14
 */
public class MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = nums[0];
            int sum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (sum < 0) {
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
                max = Math.max(max, sum);
            }
            return max;
        }
    }
}
