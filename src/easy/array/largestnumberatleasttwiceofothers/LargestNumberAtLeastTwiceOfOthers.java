package easy.array.largestnumberatleasttwiceofothers;
/**
 * LargestNumberAtLeastTwiceOfOthers
 * 
 * @author john 2020/6/3
 */
public class LargestNumberAtLeastTwiceOfOthers {
    class Solution {
        public int dominantIndex(int[] nums) {
            int idx = 0;
            int max = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    idx = i;
                }
            }
            for (int num : nums) {
                if (num != max && num * 2 >max) {
                    return -1;
                }
            }
            return idx;
        }
    }
}