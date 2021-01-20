package easy.math.minimumcosttomovechipstothesameposition;
/**
 * MinimumCostToMoveChipsToTheSamePosition
 * 
 * @author john 2021/1/20
 */
public class MinimumCostToMoveChipsToTheSamePosition {
  class Solution {
    public int minCostToMoveChips(int[] position) {
      int oddCount = 0, evenCount = 0;
      for (int i : position) {
        if ((i & 1) == 0) {
          evenCount++;
        } else {
          oddCount++;
        }
      }
      return Math.min(oddCount, evenCount);
    }
  }
}