package easy.math.maximum69number;

/**
 * Maximum69Number
 * 
 * @author john 2021/1/21
 */
public class Maximum69Number {
  class Solution {
    public int maximum69Number (int num) {
      char[] numChars = String.valueOf(num).toCharArray();
      for (int i = 0; i < numChars.length; i++) {
        if (numChars[i] == '6') {
          numChars[i] = '9';
          break;
        }
      }
      return Integer.parseInt(new String(numChars));
    }
  }
}