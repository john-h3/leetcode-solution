package easy.math.primearrangements;

/**
 * PrimeArrangements
 *
 * @author john 2021/1/20
 */
public class PrimeArrangements {
  class Solution {
    public int numPrimeArrangements(int n) {
      var primeCount = 0;
      for (int i = 1; i <= n; i++) {
        primeCount += checkPrime(i) ? 1 : 0;
      }
      var result = 1L;
      for (int i = 1; i <= primeCount; i++) {
        result *= i;
        result %= 1000000007;
      }

      for (int i = 1; i <= n - primeCount; i++) {
        result *= i;
        result %= 1000000007;
      }
      return (int) result;
    }

    private boolean checkPrime(int n) {
      if (n == 1) return false;
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
}
