package easy.array.maximumaveragesubarrayi;

/**
 * MaximumAverageSubarrayI
 *
 * @author john 2020/5/25
 */
public class MaximumAverageSubarrayI {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int maxSum = 0;
            for (int i = 0; i < k; i++) {
                maxSum += nums[i];
            }
            int currentKSum = maxSum;
            for (int i = 1; i <= nums.length - k; i++) {
                currentKSum = currentKSum - nums[i - 1] + nums[i - 1 + k];
                maxSum = Math.max(maxSum, currentKSum);
            }
            return maxSum / (double) k;
        }
    }
}