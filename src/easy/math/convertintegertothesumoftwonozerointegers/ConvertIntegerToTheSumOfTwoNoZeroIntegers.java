package easy.math.convertintegertothesumoftwonozerointegers;

/**
 * ConvertIntegerToTheSumOfTwoNoZeroIntegers
 * 
 * @author john 2021/1/21
 */
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
  class Solution {
    public int[] getNoZeroIntegers(int n) {
      var result = new int[2];
      for (int i = 1; i <= n / 2; i++) {
        if (noZeroCheck(i) && noZeroCheck(n - i)) {
          result[0] = i;
          result[1] = n - i;
          break;
        }
      }
      return result;
    }

    private boolean noZeroCheck(int n) {
      for (char aChar : String.valueOf(n).toCharArray()) {
        if (aChar == '0') {
          return false;
        }
      }
      return true;
    }
  }
}