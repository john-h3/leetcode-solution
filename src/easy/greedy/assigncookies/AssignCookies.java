package easy.greedy.assigncookies;

import java.util.Arrays;

/**
 * AssignCookies
 *
 * @author john 2021/2/18
 */
public class AssignCookies {
  class Solution {
    public int findContentChildren(int[] g, int[] s) {
      var count = 0;
      Arrays.sort(g);
      Arrays.sort(s);
      var sIdx = 0;
      OUT: for (int i = 0; i < g.length && sIdx < s.length; i++,count++)
        while (g[i] > s[sIdx++]) if (sIdx == s.length) break OUT;
      return count;
    }
  }
}
