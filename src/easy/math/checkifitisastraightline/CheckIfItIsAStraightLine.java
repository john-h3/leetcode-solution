package easy.math.checkifitisastraightline;
/**
 * CheckIfItIsAStraightLine
 *
 * @author john 2021/1/20
 */
public class CheckIfItIsAStraightLine {
  class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
      if (coordinates.length == 2) return true;
      var p1 = coordinates[0];
      var p2 = coordinates[1];
      if (p1[0] == p2[0])
        for (int[] coordinate : coordinates) {
          if (coordinate[0] != p1[0]) return false;
        }
      else if (p1[1] == p2[1])
        for (int[] coordinate : coordinates) {
          if (coordinate[1] != p1[1]) return false;
        }
      else {
        double k = (0.0 + p2[1] - p1[1]) / (p2[0] - p1[0]);
        for (int i = 2; i < coordinates.length; i++) {
          var coordinate = coordinates[i];
          if ((0.0 + coordinate[1] - p1[1]) / (coordinate[0] - p1[0]) != k) {
            return false;
          }
        }
      }
      return true;
    }
  }
}
