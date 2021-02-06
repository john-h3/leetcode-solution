package easy.depthfirstsearch.colorfilllcci;
/**
 * ColorFillLcci
 *
 * @author john 2021/2/6
 */
public class ColorFillLcci {
  class Solution {
    int color = -1;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      if (sr >= 0 && sc >= 0 && sr < image.length && sc < image[0].length) {
        var c = image[sr][sc];
        if (color == -1) color = c;
        if (c != newColor && c == color) {
          image[sr][sc] = newColor;
          floodFill(image, sr - 1, sc, newColor);
          floodFill(image, sr + 1, sc, newColor);
          floodFill(image, sr, sc + 1, newColor);
          floodFill(image, sr, sc - 1, newColor);
        }
      }
      return image;
    }
  }
}
