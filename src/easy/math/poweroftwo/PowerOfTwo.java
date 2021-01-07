package easy.math.poweroftwo;

/**
 * PowerOfTwo
 *
 * @author john 2021/1/7
 */
public class PowerOfTwo {
  class Solution {
    public boolean isPowerOfTwo(int n) {
      if (n <= 0) {
        return false;
      }
      boolean isPower = false;
      for (int i = 0; i < 32; i++) {
        if (n == 1 << i) {
          isPower = true;
          break;
        }
      }
      return isPower;
    }
  }
}
