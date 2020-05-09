package easy.array.containsduplicate;

import java.util.Arrays;

/**
 * ContainsDuplicate
 *
 * @author john 2020/5/9
 */
public class ContainsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            return nums.length != Arrays.stream(nums).distinct().count();
        }
    }
}