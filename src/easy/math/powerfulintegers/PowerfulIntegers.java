package easy.math.powerfulintegers;

import java.util.HashSet;
import java.util.List;

/**
 * PowerfulIntegers
 *
 * @author john 2021/1/18
 */
public class PowerfulIntegers {
  class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
      var set = new HashSet<Integer>();
      for (int i = 0; pow(x, i) < bound; i++) {
        for (int j = 0; pow(y, j) + pow(x, i) <= bound; j++) {
          set.add(pow(x, i) + pow(y, j));
          if (pow(y, j + 1) == pow(y, j)) {
            break;
          }
        }
        if (pow(x, i + 1) == pow(x, i)) {
          break;
        }
      }
      return List.copyOf(set);
    }

    private int pow(int x, int n) {
      return (int) Math.round(Math.pow(x, n));
    }
  }
}
