package easy.sort.matrixcellsindistanceorder;

import java.util.ArrayList;
import java.util.List;

/**
 * MatrixCellsInDistanceOrder
 *
 * @author john 2021/2/27
 */
public class MatrixCellsInDistanceOrder {
  class Solution {
    private int r0,c0;
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
      this.r0 = r0;
      this.c0 = c0;
      var maxLen = 0;
      maxLen = Math.max(maxLen, calDist(0, 0));
      maxLen = Math.max(maxLen, calDist(0, C - 1));
      maxLen = Math.max(maxLen, calDist(R - 1, 0));
      maxLen = Math.max(maxLen, calDist(R - 1, C - 1));
      var table = new ArrayList<List<int[]>>(maxLen);
      for (int i = 0; i < maxLen + 1; i++) {
        table.add(new ArrayList<>());
      }
      var size = 0;
      for (int r = 0; r < R; r++) {
        for (int c = 0; c < C; c++) {
          table.get(calDist(r, c)).add(new int[] {r, c});
          size++;
        }
      }
      var ans = new int[size][2];
      var idx = 0;
      for (List<int[]> cells : table) {
        for (int[] cell : cells) {
          ans[idx++] = cell;
        }
      }
      return ans;
    }
    
    private int calDist(int r, int c) {
      return Math.abs(r0 - r) + Math.abs(c0 - c);
    }
  }
}
