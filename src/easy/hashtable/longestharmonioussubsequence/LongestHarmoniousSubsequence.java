package easy.hashtable.longestharmonioussubsequence;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * LongestHarmoniousSubsequence
 *
 * @author john 2021/2/10
 */
public class LongestHarmoniousSubsequence {
  class Solution {
    public int findLHS(int[] nums) {
      var table = new HashMap<Integer, Integer>();
      
      for (var i : nums) {
        table.merge(i, 1, Integer::sum);
      }
      var longest = 0;
      for (Integer k : table.keySet()) {
        if (table.containsKey(k - 1)) {
          longest = Math.max(longest, table.get(k) + table.get(k - 1));
        }
      }
      return longest;
    }
  }
}
