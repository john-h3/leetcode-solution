package easy.bitmanipulation.reversebits;

/**
 * ReverseBits
 *
 * @author john 2021/3/8
 */
public class ReverseBits {
  public class Solution {
    public int reverseBits(int n) {
      var ans = 0;
      for (int i = 0; i < 32; i++) {
        ans |= ((n >>> i) & 1) << (31 - i);
      }
      return ans;
    }
  }
}