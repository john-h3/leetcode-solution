package easy.depthfirstsearch.floodfill;
/**
 * FloodFill
 *
 * @author john 2021/2/6
 */
public class FloodFill {
  class Solution {
    private int[][] image;
    private int sameColor;
    private int newColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      this.image = image;
      sameColor = image[sr][sc];
      this.newColor = newColor;
      dfs(sr, sc);
      return image;
    }

    private void dfs(int sr, int sc) {
      if (sr >= 0 && sc >= 0 && sr < image.length && sc < image[0].length) {
        if (image[sr][sc] == sameColor && image[sr][sc] != newColor) {
          image[sr][sc] = newColor;
          dfs(sr - 1, sc);
          dfs(sr + 1, sc);
          dfs(sr, sc + 1);
          dfs(sr, sc - 1);
        }
      }
    }
  }
}
