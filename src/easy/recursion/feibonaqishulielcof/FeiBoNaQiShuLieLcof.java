package easy.recursion.feibonaqishulielcof;

/**
 * FeiBoNaQiShuLieLcof
 *
 * @author john 2021/4/3
 */
public class FeiBoNaQiShuLieLcof {
  class Solution {
    public int fib(int n) {
      var fibs = new int[n + 1];
      if (n > 0) fibs[1] = 1;
      for (int i = 2; i <= n; i++) {
        fibs[i] = fibs[i - 1] + fibs[i - 2];
        fibs[i] %= 1000000007;
      }
      return fibs[n];
    }
  }
}
