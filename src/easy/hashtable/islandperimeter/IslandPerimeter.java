package easy.hashtable.islandperimeter;

/**
 * IslandPerimeter
 *
 * @author john 2021/2/9
 */
public class IslandPerimeter {
  class Solution {
    public int islandPerimeter(int[][] grid) {
      var landSum = 0;
      var overlap = 0;
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
          if (grid[i][j] == 1) {
            landSum++;
            if (i < grid.length - 1 && grid[i + 1][j] == 1) overlap++;
            if (j < grid[i].length - 1 && grid[i][j + 1] == 1) overlap++;
          }
        }
      }
      return landSum * 4 - 2 * overlap;
    }
  }
}
