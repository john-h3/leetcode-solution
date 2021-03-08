package easy.bitmanipulation.numberof1bits;

/**
 * NumberOf1Bits
 *
 * @author john 2021/3/8
 */
public class NumberOf1Bits {
  public class Solution {
    public int hammingWeight(int n) {
      var ans = 0;
      while (n != 0) {
        ans++;
        n &= n - 1;
      }
      return ans;
    }
  }
}
