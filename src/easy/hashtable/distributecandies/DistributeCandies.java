package easy.hashtable.distributecandies;

import java.util.HashMap;

/**
 * DistributeCandies
 *
 * @author john 2021/2/10
 */
public class DistributeCandies {
  class Solution {
    public int distributeCandies(int[] candyType) {
      var table = new HashMap<Integer, Integer>();
      for (int t : candyType) {
        table.merge(t, 1, Integer::sum);
      }
      var half = candyType.length / 2;
      int typeSize = table.size();
      if (typeSize >= half) return half;
      return typeSize;
    }
  }
}