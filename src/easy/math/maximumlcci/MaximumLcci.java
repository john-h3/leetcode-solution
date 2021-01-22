package easy.math.maximumlcci;

/**
 * MaximumLcci
 *
 * @author john 2021/1/22
 */
public class MaximumLcci {
  class Solution {
    public int maximum(int a, int b) {
      int k = (int) (((long) a - (long) b) >>> 63);
      return a * (k ^ 1) + b * (k);
    }
  }
}
