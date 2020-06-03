package easy.array.findpivotindex;

import java.util.Arrays;

/**
 * FindPivotIndex
 *
 * @author john 2020/6/3
 */
public class FindPivotIndex {
    class Solution {
        public int pivotIndex(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            int lSum = 0;
            int rSum = sum;
            for (int i = 0; i < nums.length; i++) {
                if (lSum == rSum - nums[i]) {
                    return i;
                } else {
                    lSum += nums[i];
                    rSum -= nums[i];
                }
            }
            return -1;
        }
    }
}