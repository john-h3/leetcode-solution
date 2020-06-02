package easy.array.longestcontinuousincreasingsubsequence;
/**
 * LongestContinuousIncreasingSubsequence
 * 
 * @author john 2020/6/2
 */
public class LongestContinuousIncreasingSubsequence {
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            if (nums.length <= 1) {
                return nums.length;
            }
            int max = 1;
            int count = 1;
            int current = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > current) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 1;
                }
                current = nums[i];
            }
            return max;
        }
    }
}