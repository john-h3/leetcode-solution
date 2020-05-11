package easy.array.movezeroes;

/**
 * MoveZeroes
 *
 * @author john 2020/5/11
 */
public class MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int p = 0;
            for (int num : nums) {
                if (num != 0) {
                    nums[p++] = num;
                }
            }
            for (int i = p; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}