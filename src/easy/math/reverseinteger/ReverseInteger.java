package easy.math.reverseinteger;

/**
 * ReverseInteger
 *
 * @author john 2020/12/29
 */
public class ReverseInteger {
  class Solution {
    public int reverse(int x) {
      if (x < 1000000000 && x > -1000000000) {
        return reverseInt(x);
      } else {
        try {
          return reverseInt(x);
        } catch (Exception e) {
          return 0;
        }
      }
    }

    private int reverseInt(int x) {
      if (x < 0) {
        StringBuilder sb = new StringBuilder(String.valueOf(x).substring(1));
        sb.reverse().insert(0, '-');
        return Integer.parseInt(sb.toString());
      }
      return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
  }
}
