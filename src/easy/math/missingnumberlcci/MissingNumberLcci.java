package easy.math.missingnumberlcci;

/**
 * MissingNumberLcci
 *
 * @author john 2021/1/22
 */
public class MissingNumberLcci {
  class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
      int maxOdd = (n & 1) == 1 ? n : n - 1;
      int oddCount = (maxOdd == n) ? n / 2 + 1 : n / 2;
      int maxEven = maxOdd == n ? n - 1 : n;
      int evenCount = n / 2;
      int oddSum = (1 + maxOdd) * oddCount / 2;
      int evenSum = (2 + maxEven) * evenCount / 2;
      for (int num : nums) {
        if ((num & 1) == 0) {
          evenSum -= num;
        } else {
          oddSum -= num;
        }
      }
      return oddSum + evenSum;
    }
  }
}
