package easy.array.removeduplicatesfromsortedarray;

/**
 * RemoveDuplicatesFromSortedArray
 *
 * @author John 2020/4/8
 */
public class RemoveDuplicatesFromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return 1;
            }
            int idx = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[idx]) {
                    nums[++idx] = nums[i];
                }
            }
            return idx+1;
        }
    }
}
