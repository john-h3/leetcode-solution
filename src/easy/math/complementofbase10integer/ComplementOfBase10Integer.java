package easy.math.complementofbase10integer;

/**
 * ComplementOfBase10Integer
 *
 * @author john 2021/1/18
 */
public class ComplementOfBase10Integer {
  class Solution {
    public int bitwiseComplement(int N) {
      var bit = 0;
      while (N >> ++bit > 0);
      return (int) Math.round(Math.pow(2, bit) - 1 - N);
    }
  }
}
