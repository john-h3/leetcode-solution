package easy.sort.shufflestring;

/**
 * ShuffleString
 *
 * @author john 2021/3/1
 */
public class ShuffleString {
  class Solution {
    public String restoreString(String s, int[] indices) {
      var chars = s.toCharArray();
      for (int i = 0; i < indices.length; i++) {
        if (indices[i] != -1) {
          var idx = indices[i];
          var val = chars[i];
          while (idx != -1) {
            var tmp = chars[idx];
            chars[idx] = val;
            val = tmp;
            var tmp2 = indices[idx];
            indices[idx] = -1;
            idx = tmp2;
          }
        }
      }
      return new String(chars);
    }
  }
}
