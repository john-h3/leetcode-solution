package easy.math.minimummovestoequalarrayelements;

import java.util.Arrays;

/**
 * MinimumMovesToEqualArrayElements
 *
 * @author john 2021/1/11
 */
public class MinimumMovesToEqualArrayElements {
  class Solution {
    public int minMoves(int[] nums) {
      int min = Arrays.stream(nums).min().orElseThrow(IllegalArgumentException::new);
      return Arrays.stream(nums).map(e -> e - min).sum();
    }
  }
}
