package easy.recursion.nthtribonaccinumber;

/**
 * NThTribonacciNumber
 *
 * @author john 2021/4/2
 */
public class NThTribonacciNumber {
  class Solution {
    public int tribonacci(int n) {
      if (n == 0) return 0;
      else if (n < 3) return 1;
      var t0 = 0;
      var t1 = 1;
      var t2 = 1;
      while (n-- > 2) {
        var t = t0 + t1 + t2;
        t0 = t1;
        t1 = t2;
        t2 = t;
      }
      return t2;
    }
  }
}