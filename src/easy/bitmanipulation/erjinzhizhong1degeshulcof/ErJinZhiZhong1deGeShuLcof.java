package easy.bitmanipulation.erjinzhizhong1degeshulcof;

/**
 * ErJinZhiZhong1deGeShuLcof
 *
 * @author john 2021/3/12
 */
public class ErJinZhiZhong1deGeShuLcof {
  public class Solution {
    private int[] eightBitTable = new int[1 << 8];

    public Solution() {
      eightBitTable[(1 << 8) - 1] = 8;
      for (int i = 1; i < 8; i++) {
        var comb = (1 << i) - 1;
        eightBitTable[comb] = i;
        while (comb < 1 << 8) {
          var x = comb & -comb;
          var y = comb + x;
          var z = comb & ~y;
          comb = z / x >> 1 | y;
          if (comb < 1 << 8) eightBitTable[comb] = i;
        }
      }
    }

    public int hammingWeight(int n) {
      var c = 0;
      for (int i = 0; i < 4; i++) {
        c += eightBitTable[n & 0xff];
        n >>>= 8;
      }
      return c;
    }
  }
}
