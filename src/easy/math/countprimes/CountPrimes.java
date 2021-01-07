package easy.math.countprimes;

/**
 * CountPrimes
 *
 * @author john 2021/1/6
 */
public class CountPrimes {
  class Solution {
    public int countPrimes(int n) {
      if (n <= 2) {
        return 0;
      }
      boolean[] flags = new boolean[n - 2];
      for (int i = 2; i <= Math.sqrt(n - 1); i++) {
        if (!flags[i - 2]) {
          for (int j = i; i * j <= n - 1; j++) {
            flags[i * j - 2] = true;
          }
        }
      }
      int c = 0;
      for (boolean flag : flags) {
        if (!flag) {
          c++;
        }
      }
      return c;
    }
  }
}
