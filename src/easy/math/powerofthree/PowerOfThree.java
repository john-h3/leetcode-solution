package easy.math.powerofthree;

import java.util.HashSet;
import java.util.Set;

/**
 * PowerOfThree
 *
 * @author john 2021/1/8
 */
public class PowerOfThree {
  class Solution {
    private int[] pArr =
        new int[] {
          1,
          3,
          9,
          27,
          81,
          243,
          729,
          2187,
          6561,
          19683,
          59049,
          177147,
          531441,
          1594323,
          4782969,
          14348907,
          43046721,
          129140163,
          387420489,
          1162261467
        };

    public boolean isPowerOfThree(int n) {
      for (int i = 0; i < pArr.length; i++) {
        if (n == pArr[i]) {
          return true;
        }
      }
      return false;
    }
  }
}
