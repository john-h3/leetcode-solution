package easy.binarysearch.sparsearraysearchlcci;

/**
 * SparseArraySearchLcci
 *
 * @author john 2021/2/25
 */
public class SparseArraySearchLcci {
  class Solution {
    public int findString(String[] words, String s) {
      int low = 0, high = words.length - 1;
      var mid = 0;
      while (low <= high) {
        mid = (low + high) >>> 1;
        var val = words[mid];
        if (val.isEmpty()) {
          var p1 = mid;
          var p2 = mid;
          var b = false;
          while (p1 > low && p2 < high) {
            if (!words[--p1].isEmpty() || !words[++p2].isEmpty()) {
              b = true;
              break;
            }
          }
          if (b) {
            var s1 = words[p1];
            var s2 = words[p2];
            if (s.equals(s1)) return p1;
            if (s.equals(s2)) return p2;
            if (!s1.isEmpty() && !s2.isEmpty()) {
              if (s.compareTo(s2) > 0) low = p2 + 1;
              else if (s.compareTo(s1) < 0) high = p1 - 1;
              else return -1;
            } else if (!words[p1].isEmpty()) {
              if (s.compareTo(s1) > 0) low = p1 + 1;
              else high = p1 - 1;
            } else {
              if (s.compareTo(s2) > 0) low = p2 + 1;
              else high = p2 - 1;
            }
          } else {
            return -1;
          }
        } else {
          if (s.compareTo(val) == 0) return mid;
          else if (s.compareTo(val) > 0) low = mid + 1;
          else high = mid - 1;
        }
      }
      return -1;
    }
  }

  public static void main(String[] args) {
    new SparseArraySearchLcci().new Solution().findString(new String[]{"DirNnILhARNS hOYIFB", "SM ", "YSPBaovrZBS", "evMMBOf", "mCrS", "oRJfjw gwuo", "xOpSEXvfI"}, "mCrS");
  }
}
