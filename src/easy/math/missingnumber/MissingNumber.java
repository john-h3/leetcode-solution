package easy.math.missingnumber;

/**
 * MissingNumber
 *
 * @author john 2021/1/8
 */
public class MissingNumber {
  class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
      boolean[] flags = new boolean[n + 1];
      for (int num : nums) {
        flags[num] = true;
      }
      for (int i = 0; i < flags.length; i++) {
        if (!flags[i]) {
          return i;
        }
      }
      return -1;
    }
  }
}
