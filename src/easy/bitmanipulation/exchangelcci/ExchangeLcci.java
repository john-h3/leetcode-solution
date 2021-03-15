package easy.bitmanipulation.exchangelcci;

/**
 * ExchangeLcci
 *
 * @author john 2021/3/15
 */
public class ExchangeLcci {
  class Solution {
    public int exchangeBits(int num) {
      // 0b0101
      // 0x5
      return ((num & 0x55555555) << 1) | ((num >>> 1) & 0x55555555);
    }
  }
}