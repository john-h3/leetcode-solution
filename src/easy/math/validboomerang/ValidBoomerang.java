package easy.math.validboomerang;
/**
 * ValidBoomerang
 *
 * @author john 2021/1/19
 */
public class ValidBoomerang {
  class Solution {
    public boolean isBoomerang(int[][] points) {
      int[] x = new int[3];
      int[] y = new int[3];
      var idx = 0;
      for (int[] aPoint : points) {
        x[idx] = aPoint[0];
        y[idx++] = aPoint[1];
      }
      return (y[1] - y[0]) * (x[2] - x[1]) != (y[2] - y[1]) * (x[1] - x[0]);
    }
  }
}
