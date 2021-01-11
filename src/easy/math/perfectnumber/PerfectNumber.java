package easy.math.perfectnumber;

import java.util.Set;

/**
 * PerfectNumber
 *
 * @author john 2021/1/11
 */
public class PerfectNumber {
  class Solution {
    public boolean checkPerfectNumber(int num) {
      if (num == 1) {
        return false;
      }
      int sum = 1;
      int sqrt = (int) Math.sqrt(num);
      for (int i = 2; i <= sqrt; i++) {
        if (num % i == 0) {
          sum += i + num / i;
        }
      }
      return sum == num;
    }
  }
}