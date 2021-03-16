package easy.bitmanipulation.addwithoutpluslcci;

/**
 * AddWithoutPlusLcci
 *
 * @author john 2021/3/16
 */
public class AddWithoutPlusLcci {
  class Solution {
    public int add(int a, int b) {
      while (a != 0) {
        var carry = (a & b) << 1;
        b ^= a;
        a = carry;
      }
      return b;
    }
  }
}