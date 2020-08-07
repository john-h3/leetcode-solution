package easy.array.shuzuzhongzhongfudeshuzilcof;

import java.util.Arrays;

/**
 * ShuZuZhongZhongFuDeShuZiLcof
 *
 * @author john 2020/8/7
 */
public class ShuZuZhongZhongFuDeShuZiLcof {
    class Solution {
        public int findRepeatNumber(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                while (nums[i] != i) {
                    if (nums[nums[i]] == nums[i]) {
                        return nums[i];
                    }
                    int tmp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = tmp;
                }
            }
            return -1;
        }
    }
}