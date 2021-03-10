package easy.bitmanipulation.binarynumberwithalternatingbits;

/**
 * BinaryNumberWithAlternatingBits
 *
 * @author john 2021/3/10
 */
public class BinaryNumberWithAlternatingBits {
  class Solution {
    public boolean hasAlternatingBits(int n) {
      var i = n ^ (n >> 1);
      return (i & (i + 1)) == 0;
    }
  }
}