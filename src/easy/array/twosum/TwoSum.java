package easy.array.twosum;

import java.util.Arrays;

/**
 * TwoSum
 *
 * @author John 2020/4/7
 */
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] map = new int[0xfff + 1];
            Arrays.fill(map, -1);
            for (int i = 0; i < nums.length; i++) {
                int idx = nums[i] & 0xfff;
                int diff = target - nums[i];
                int diffIdx = diff & 0xfff;
                if (map[diffIdx] != -1) {
                    return new int[]{map[diffIdx], i};
                }
                map[idx] = i;
            }
            return null;
        }
    }
}
