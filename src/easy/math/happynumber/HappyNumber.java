package easy.math.happynumber;

import java.util.HashSet;
import java.util.Set;

/**
 * HappyNumber
 *
 * @author john 2021/1/6
 */
public class HappyNumber {
  class Solution {
    public boolean isHappy(int n) {
      Set<Integer> set = new HashSet<>();
      while (!set.contains(n)) {
        set.add(n);
        n = squareSum(n);
        if (n == 1) {
          return true;
        }
      }
      return false;
    }

    private int squareSum(int n) {
      char[] chars = String.valueOf(n).toCharArray();
      int sum = 0;
      for (char c : chars) {
        int v = c - '0';
        sum += v * v;
      }
      return sum;
    }
  }
}
