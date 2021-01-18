package easy.math.distringmatch;

/**
 * DiStringMatch
 *
 * @author john 2021/1/18
 */
public class DiStringMatch {
  class Solution {
    public int[] diStringMatch(String S) {
      var N = S.length();
      var result = new int[N + 1];
      var i = 0;
      var idx = 0;
      for (char c : S.toCharArray()) {
        if (c == 'I') {
          result[idx++] = i++;
        } else if (c == 'D') {
          result[idx++] = N--;
        }
      }
      result[idx] = i;
      return result;
    }
  }
}
