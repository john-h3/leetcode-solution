package easy.backtracking.binarywatch;

import java.util.ArrayList;
import java.util.List;

/**
 * BinaryWatch
 *
 * @author john 2021/3/1
 */
public class BinaryWatch {
  class Solution {
    private List<String> ans = new ArrayList<>();

    public List<String> readBinaryWatch(int num) {
      if (num == 0) return List.of("0:00");
      _enum(num, 0, 10, 0);
      return ans;
    }

    private void _enum(int k, int s, int n, int base) {
      for (int i = s; i <= n - k; i++) {
        var b = base + (1 << (n - i - 1));
        if (k - 1 > 0) _enum(k - 1, i + 1, n, b);
        else {
          var hourBit = b >> 6;
          if (hourBit > 11) continue;
          var minuteBit = b & ((1 << 6) - 1);
          if (minuteBit > 59) continue;
          if (hourBit == 0 && minuteBit == 0) continue;
          ans.add(String.format("%d:%02d", hourBit, minuteBit));
        }
      }
    }
  }

  public static void main(String[] args) {
    new BinaryWatch().new Solution().readBinaryWatch(3);
  }
}
