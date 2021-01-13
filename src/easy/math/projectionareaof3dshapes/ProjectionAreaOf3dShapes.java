package easy.math.projectionareaof3dshapes;

/**
 * ProjectionAreaOf3dShapes
 *
 * @author john 2021/1/13
 */
public class ProjectionAreaOf3dShapes {
  class Solution {
    public int projectionArea(int[][] grid) {
      int area = 0;
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid.length; j++) {
          if (grid[i][j] > 0) {
            area++;
          }
        }
      }
      for (int i = 0; i < grid.length; i++) {
        int max = 0;
        for (int j = 0; j < grid[i].length; j++) {
          if (grid[i][j] > max) {
            max = grid[i][j];
          }
        }
        area += max;
      }
      for (int i = 0; i < grid.length; i++) {
        int max = 0;
        for (int j = 0; j < grid.length; j++) {
          if (grid[j][i] > max) {
            max = grid[j][i];
          }
        }
        area += max;
      }
      return area;
    }
  }
}
