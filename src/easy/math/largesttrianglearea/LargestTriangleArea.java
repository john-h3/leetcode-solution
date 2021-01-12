package easy.math.largesttrianglearea;

/**
 * LargestTriangleArea
 *
 * @author john 2021/1/12
 */
public class LargestTriangleArea {
  class Solution {
    public double largestTriangleArea(int[][] points) {
      double area = 0;
      for (int i = 0; i < points.length - 2; i++) {
        for (int j = i + 1; j < points.length - 1; j++) {
          for (int k = j + 1; k < points.length; k++) {
            double a = area(points[i], points[j], points[k]);
            if (a > area) {
              area = a;
            }
          }
        }
      }
      return area;
    }

    // S=|1/2(x1y2+x2y3+x3y1-y1x2-y2x3-y3x1)|
    private double area(int[] a, int[] b, int[] c) {
      return Math.abs(
          0.5
              * (a[0] * b[1]
                  + b[0] * c[1]
                  + c[0] * a[1]
                  - a[1] * b[0]
                  - b[1] * c[0]
                  - c[1] * a[0]));
    }
  }
}
