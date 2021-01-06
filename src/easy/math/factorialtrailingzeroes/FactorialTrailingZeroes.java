package easy.math.factorialtrailingzeroes;

/**
 * FactorialTrailingZeroes
 *
 * @author john 2021/1/6
 */
public class FactorialTrailingZeroes {
  class Solution {
    public int trailingZeroes(int n) {
      int sum = 0;
      while (n >= 5) {
        sum += n /= 5;
      }
      return sum;
    }
  }
}
