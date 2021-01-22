package easy.math.factorialzeroslcci;

/**
 * FactorialZerosLcci
 *
 * @author john 2021/1/22
 */
public class FactorialZerosLcci {
  class Solution {
    public int trailingZeroes(int n) {
      var result = 0;
      while ((n /= 5) > 0) {
        result += n;
      }
      return result;
    }
  }
}
