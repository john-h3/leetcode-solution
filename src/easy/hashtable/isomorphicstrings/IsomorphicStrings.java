package easy.hashtable.isomorphicstrings;

import java.util.Arrays;
import java.util.HashMap;

/**
 * IsomorphicStrings
 *
 * @author john 2021/2/7
 */
public class IsomorphicStrings {
  class Solution {
    public boolean isIsomorphic(String s, String t) {
      var idx = 0;
      var table = new int[0x7f];
      StringBuilder builder = new StringBuilder();
      for (char c : s.toCharArray()) {
        if (table[c] == 0) table[c] = ++idx;
        builder.append(table[c]);
      }
      s = builder.toString();
      idx = 0;
      builder.delete(0, s.length());
      Arrays.fill(table, 0);
      for (char c : t.toCharArray()) {
        if (table[c] == 0) table[c] = ++idx;
        builder.append(table[c]);
      }
      return builder.toString().equals(s);
    }
  }
}
