package easy.array.nondecreasingarray;

/**
 * NonDecreasingArray
 *
 * @author john 2020/6/2
 */
public class NonDecreasingArray {
    class Solution {
        public boolean checkPossibility(int[] nums) {
            if (nums.length == 1) {
                return true;
            }
            int count = 0;
            int idx = -1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    idx = i;
                    count++;
                }
            }
            if (count >= 2) {
                return false;
            } else if (count == 0) {
                return true;
            } else {
                return idx == 1 || idx == nums.length - 1 || nums[idx + 1] > nums[idx - 1] || (nums[idx + 1] > nums[idx - 2] && nums[idx] > nums[idx -2]);
            }
        }
    }
}