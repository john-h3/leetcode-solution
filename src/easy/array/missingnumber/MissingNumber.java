package easy.array.missingnumber;

import java.util.Arrays;

/**
 * MissingNumber
 *
 * @author john 2020/5/9
 */
public class MissingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            int sum = 0;
            for (int i = 0; i <= nums.length; i++) {
                sum += i;
            }
            for (int num : nums) {
                sum -= num;
            }
            return sum;
        }
    }
}