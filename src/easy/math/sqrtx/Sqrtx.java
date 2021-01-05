package easy.math.sqrtx;

/**
 * Sqrtx
 *
 * @author john 2021/1/5
 */
public class Sqrtx {
  class Solution {
    public int mySqrt(int x) {
      if (x < 2) {
        return x;
      }
      int r = x;
      while (x / r < r) {
        double _r = r;
        r = (int) (_r / 2 + x / _r / 2);
      }
      return r;
    }
  }
}
