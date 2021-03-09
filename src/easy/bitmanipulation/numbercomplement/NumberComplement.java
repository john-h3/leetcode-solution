package easy.bitmanipulation.numbercomplement;

/**
 * NumberComplement
 *
 * @author john 2021/3/9
 */
public class NumberComplement {
  class Solution {
    public int findComplement(int num) {
      var bitCount = 0;
      for (; bitCount < 32; bitCount++) {
        if (num >>> bitCount == 0) break;
      }
      return (0xffffffff >>> (32 - bitCount)) & ~num;
    }
  }

  public static void main(String[] args) {
    new NumberComplement().new Solution().findComplement(3);
  }
}
