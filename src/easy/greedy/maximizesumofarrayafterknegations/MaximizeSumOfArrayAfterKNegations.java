package easy.greedy.maximizesumofarrayafterknegations;

import java.util.Arrays;

/**
 * MaximizeSumOfArrayAfterKNegations
 *
 * @author john 2021/2/19
 */
public class MaximizeSumOfArrayAfterKNegations {
  class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
      Arrays.sort(A);
      var negativeCount = 0;
      for (int i : A) {
        if (i < 0) negativeCount++;
      }
      var negationNum = Math.min(K, negativeCount);
      for (int i = 0; i < A.length && i < negationNum; i++) {
        A[i] = -A[i];
      }
      var sum = Arrays.stream(A).sum();
      var min = Arrays.stream(A).min().orElseThrow();
      if (negationNum < K && ((K - negationNum) & 1) == 1) {
        sum -= 2 * min;
      }
      return sum;
    }
  }
}
