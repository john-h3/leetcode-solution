package easy.array.searchinsertposition;

/**
 * SearchInsertPosition
 *
 * @author John 2020/4/8
 */
public class SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (target <= nums[i]) {
                    return i;
                }
            }
            return nums.length;
        }
    }
}
