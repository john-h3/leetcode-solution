package easy.math.uglynumber;

/**
 * UglyNumber
 *
 * @author john 2021/1/7
 */
public class UglyNumber {
  class Solution {
    public boolean isUgly(int num) {
      if (num <= 0) {
        return false;
      }
      return recursiveDivide(num);
    }

    private boolean recursiveDivide(int num) {
      if (num == 1) {
        return true;
      }
      if (num % 2 == 0) {
        return recursiveDivide(num / 2);
      } else if (num % 3 == 0) {
        return recursiveDivide(num / 3);
      } else if (num % 5 == 0) {
        return recursiveDivide(num / 5);
      } else {
        return false;
      }
    }
  }
}
