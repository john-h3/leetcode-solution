package easy.math.setmismatch;

/**
 * SetMismatch
 *
 * @author john 2021/1/12
 */
public class SetMismatch {
  class Solution {
    public int[] findErrorNums(int[] nums) {
      byte[] table = new byte[nums.length + 1];
      for (int num : nums) {
        table[num]++;
      }
      int[] result = new int[2];
      for (int i = 1; i < table.length; i++) {
        if (table[i] == 0) {
          result[1] = i;
          if (result[0] != 0) {
            break;
          }
        } else if (table[i] == 2) {
          result[0] = i;
          if (result[1] != 0) {
            break;
          }
        }
      }
      return result;
    }
  }
}
