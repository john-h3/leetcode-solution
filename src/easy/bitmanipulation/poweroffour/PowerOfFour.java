package easy.bitmanipulation.poweroffour;

/**
 * PowerOfFour
 *
 * @author john 2021/3/9
 */
public class PowerOfFour {
  class Solution {
    public boolean isPowerOfFour(int n) {
      return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }
  }
}
