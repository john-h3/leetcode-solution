package easy.math.rangeadditionii;

/**
 * RangeAdditionIi
 *
 * @author john 2021/1/11
 */
public class RangeAdditionIi {
  class Solution {
    public int maxCount(int m, int n, int[][] ops) {
      if (ops.length == 0) {
        return m * n;
      }
      int minA = ops[0][0], minB = ops[0][1];
      for (int[] op : ops) {
        if (op[0] < minA) {
          minA = op[0];
        }
        if (op[1] < minB) {
          minB = op[1];
        }
      }
      return minA * minB;
    }
  }
}
