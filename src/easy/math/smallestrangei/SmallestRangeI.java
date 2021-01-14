package easy.math.smallestrangei;

import java.util.Arrays;

/**
 * SmallestRangeI
 *
 * @author john 2021/1/14
 */
public class SmallestRangeI {
  class Solution {
    public int smallestRangeI(int[] A, int K) {
      int min = Arrays.stream(A).min().orElseThrow();
      int max = Arrays.stream(A).max().orElseThrow();
      int diff = max - min - 2 * K;
      return Math.max(diff, 0);
    }
  }
}
