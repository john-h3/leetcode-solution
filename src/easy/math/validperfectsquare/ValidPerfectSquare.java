package easy.math.validperfectsquare;

/**
 * ValidPerfectSquare
 *
 * @author john 2021/1/8
 */
public class ValidPerfectSquare {
  class Solution {
    public boolean isPerfectSquare(int num) {
      if (num == 1) {
        return true;
      }
      int sqrt = num / 2;
      while (num / sqrt < sqrt) {
        sqrt = (sqrt + num / sqrt) / 2;
      }
      return sqrt * sqrt == num;
    }
  }
}
