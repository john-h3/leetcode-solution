package easy.bitmanipulation.insertintobitslcci;
/**
 * InsertIntoBitsLcci
 *
 * @author john 2021/3/13
 */
public class InsertIntoBitsLcci {
  class Solution {
    public int insertBits(int N, int M, int i, int j) {
      var mask = (1 << (j - i + 1) - 1) << i;
      return (N & mask) | (M << i);
    }
  }
}
