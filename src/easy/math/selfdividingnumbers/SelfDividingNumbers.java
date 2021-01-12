package easy.math.selfdividingnumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * SelfDividingNumbers
 *
 * @author john 2021/1/12
 */
public class SelfDividingNumbers {
  class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> li = new ArrayList<>();
      for (int i = left; i <= right; i++) {
        if (isSelfDividing(i)) {
          li.add(i);
        }
      }
      return li;
    }

    private boolean isSelfDividing(int num) {
      char[] numChars = String.valueOf(num).toCharArray();
      for (char c : numChars) {
        if (c == '0' || num % (c - '0') != 0) {
          return false;
        }
      }
      return true;
    }
  }
}
