package easy.math.adddigits;

/**
 * AddDigits
 *
 * @author john 2021/1/7
 */
public class AddDigits {
  class Solution {
    public int addDigits(int num) {
      char[] chars = String.valueOf(num).toCharArray();
      int sum = 0;
      for (char c : chars) {
        sum += c - '0';
      }
      return sum(sum);
    }

    private int sum(int n) {
      if (n == 10) {
        return 1;
      }
      if (n > 10) {
        n = sum(n / 10 + n % 10);
      }
      return n;
    }
  }
}
