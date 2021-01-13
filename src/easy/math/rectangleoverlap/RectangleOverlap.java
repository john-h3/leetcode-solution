package easy.math.rectangleoverlap;

/**
 * RectangleOverlap
 *
 * @author john 2021/1/13
 */
public class RectangleOverlap {
  class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
      if (notRect(rec1) || notRect(rec2)) {
        return false;
      }
      return isOverlap(new int[] {rec1[0], rec1[2]}, new int[] {rec2[0], rec2[2]})
          && isOverlap(new int[] {rec1[1], rec1[3]}, new int[] {rec2[1], rec2[3]});
    }

    private boolean isOverlap(int[] range1, int[] range2) {
      return range1[1] > range2[0] && range1[0] < range2[1];
    }

    private boolean notRect(int[] rec) {
      return rec[0] == rec[2] || rec[1] == rec[3];
    }
  }
}
