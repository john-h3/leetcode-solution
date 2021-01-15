package easy.math.surfaceareaof3dshapes;

/**
 * SurfaceAreaOf3dShapes
 *
 * @author john 2021/1/14
 */
public class SurfaceAreaOf3dShapes {
  class Solution {
    public int surfaceArea(int[][] grid) {
      var newGrid = new int[grid.length + 2][grid.length + 2];
      for (int i = 0; i < grid.length; i++) {
        System.arraycopy(grid[i], 0, newGrid[i+1], 1, grid.length);
      }
      int sum = 0;
      for (int i = 1; i < newGrid.length - 1; i++) {
        for (int j = 1; j < newGrid.length - 1; j++) {
          var h = newGrid[i][j];
          if (h > 0) {
            sum += 6 * h - 2 * (h - 1);
          }
          sum -= Math.min(h, newGrid[i - 1][j]);
          sum -= Math.min(h, newGrid[i + 1][j]);
          sum -= Math.min(h, newGrid[i][j - 1]);
          sum -= Math.min(h, newGrid[i][j + 1]);
        }
      }
      return sum;
    }
  }
}
