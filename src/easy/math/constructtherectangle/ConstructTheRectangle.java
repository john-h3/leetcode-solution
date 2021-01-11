package easy.math.constructtherectangle;

/**
 * ConstructTheRectangle
 *
 * @author john 2021/1/11
 */
public class ConstructTheRectangle {
  class Solution {
    public int[] constructRectangle(int area) {
      int sqrt = (int) Math.sqrt(area);
      for (int i = sqrt; i > 0; i--) {
        if (area % i == 0) {
          return new int[] {area / i, i};
        }
      }
      throw new IllegalArgumentException();
    }
  }
}
