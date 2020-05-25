package easy.array.shortestunsortedcontinuoussubarray;

import java.util.Arrays;

/**
 * ShortestUnsortedContinuousSubarray
 *
 * @author john 2020/5/25
 */
public class ShortestUnsortedContinuousSubarray {
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }
            int errorEndIdx = 0;
            int errorStartIdx = nums.length - 1;
            int max = nums[errorEndIdx];
            int min = nums[errorStartIdx];
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                int rIdx = nums.length - 1 - i;
                min = Math.min(min, nums[rIdx]);
                if (nums[i] < max) {
                    errorEndIdx = i;
                }
                if (nums[rIdx] > min) {
                    errorStartIdx = rIdx;
                }
            }
            return errorEndIdx > errorStartIdx ? errorEndIdx - errorStartIdx + 1 : 0;
        }
    }
}