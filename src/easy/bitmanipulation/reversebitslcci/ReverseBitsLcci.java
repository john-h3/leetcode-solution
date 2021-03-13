package easy.bitmanipulation.reversebitslcci;
/**
 * ReverseBitsLcci
 *
 * @author john 2021/3/13
 */
public class ReverseBitsLcci {
  class Solution {
    public int reverseBits(int num) {
      var ans = 0;
      int prevSerialCount = 0;
      int currentSerialCount = 0;
      for (int i = 0; i < 32; i++) {
        if ((num >>> i & 1) == 1) {
          currentSerialCount++;
        } else {
          prevSerialCount = currentSerialCount;
          currentSerialCount = 0;
        }
        ans = Math.max(ans, prevSerialCount + 1 + currentSerialCount);
      }
      return Math.min(ans, 32);
    }
  }
}
