package easy.math.addbinary;

/**
 * AddBinary
 *
 * @author john 2021/1/5
 */
public class AddBinary {
  class Solution {
    public String addBinary(String a, String b) {
      char[] ac = a.toCharArray(), bc = b.toCharArray(), big, small;
      big = a.length() > b.length() ? ac : bc;
      small = a.length() > b.length() ? bc : ac;
      for (int i = 0; i < small.length; i++) {
        if (small[small.length - 1 - i] == '1') {
          big[big.length - 1 - i]+=1;
        }
      }
      byte carry = 0;
      for (int i = big.length - 1; i >= 0; i--) {
        big[i] += carry;
        if (big[i] > '1') {
          big[i] -= 2;
          carry = 1;
        } else {
          carry = 0;
        }
      }
      if (carry != 0) {
        char[] sum = new char[big.length + 1];
        sum[0] = '1';
        System.arraycopy(big, 0, sum, 1, big.length);
        return new String(sum);
      }
      return new String(big);
    }
  }
}
