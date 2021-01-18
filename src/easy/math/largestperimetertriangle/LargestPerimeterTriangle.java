package easy.math.largestperimetertriangle;

import java.util.Arrays;

/**
 * LargestPerimeterTriangle
 * 
 * @author john 2021/1/18
 */
public class LargestPerimeterTriangle {
  class Solution {
    public int largestPerimeter(int[] A) {
      Arrays.sort(A);
      for (int i = A.length - 1; i >= 2; i--) {
        if (A[i] < A[i - 1] + A[i - 2]) {
          return A[i] + A[i - 1] + A[i - 2];
        }
      }
      return 0;
    }
  }
}