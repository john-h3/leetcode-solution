package easy.bitmanipulation.convertanumbertohexadecimal;

/**
 * ConvertANumberToHexadecimal
 *
 * @author john 2021/3/9
 */
public class ConvertANumberToHexadecimal {
  class Solution {
    private char[] table;

    public Solution() {
      table = new char[16];
      for (int i = 0; i < 10; i++) {
        table[i] = (char) ('0' + i);
      }
      for (int i = 10; i < 16; i++) {
        table[i] = (char) ('a' + i - 10);
      }
    }

    public String toHex(int num) {
      var chars = new char[8];
      var b = false;
      for (int i = 0; i < 8; i++) {
        var offset = (7 - i) * 4;
        chars[i] = table[(num & (0xf << offset)) >>> offset];
      }
      var start = 7;
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] != '0') {
          start = i;
          break;
        }
      }
      return new String(chars, start, chars.length - start);
    }
  }

  public static void main(String[] args) {
    new ConvertANumberToHexadecimal().new Solution().toHex(26);
  }
}
