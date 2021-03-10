package easy.bitmanipulation.primenumberofsetbitsinbinaryrepresentation;

import java.util.Arrays;

/**
 * PrimeNumberOfSetBitsInBinaryRepresentation
 *
 * @author john 2021/3/10
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {
  class Solution {
    private boolean[] f = new boolean[33];

    public Solution() {
      Arrays.fill(f, 2, f.length, true);
      for (int i = 2; i < 32; i++) {
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            f[i] = false;
            break;
          }
        }
      }
    }

    public int countPrimeSetBits(int L, int R) {
      var ans = 0;
      for (int i = L; i <= R; i++) {
        if (f[Integer.bitCount(i)]) ans++;
      }
      return ans;
    }
  }
}
