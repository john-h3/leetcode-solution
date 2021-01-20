package easy.math.subtracttheproductandsumofdigitsofaninteger;
/**
 * SubtractTheProductAndSumOfDigitsOfAnInteger
 *
 * @author john 2021/1/20
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
  class Solution {
    public int subtractProductAndSum(int n) {
      var nChars = String.valueOf(n).toCharArray();
      int product = 1, sum = 0;
      for (char aChar : nChars) {
        product *= aChar - '0';
        sum += aChar - '0';
      }
      return product - sum;
    }
  }
}
