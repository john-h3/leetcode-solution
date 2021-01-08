package easy.math.arrangingcoins;

/**
 * ArrangingCoins
 *
 * @author john 2021/1/8
 */
public class ArrangingCoins {
  class Solution {
    public int arrangeCoins(int n) {
      long nl = n;
      return (int) ((Math.sqrt(1 + 8 * nl) - 1) / 2);
    }
  }
}
