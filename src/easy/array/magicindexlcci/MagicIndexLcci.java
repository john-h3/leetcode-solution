package easy.array.magicindexlcci;

/**
 * MagicIndexLcci
 * 
 * @author john 2020/8/8
 */
public class MagicIndexLcci {
    class Solution {
        public int findMagicIndex(int[] nums) {
            int idx = 0;
            while (idx < nums.length) {
                if (nums[idx] == idx) {
                    return idx;
                } else if (nums[idx] > idx) {
                    idx = nums[idx];
                } else {
                    idx++;
                }
            }
            return -1;
        }
    }
}