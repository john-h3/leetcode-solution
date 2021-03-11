package easy.bitmanipulation.numberofstepstoreduceanumbertozero;

/**
 * NumberOfStepsToReduceANumberToZero
 *
 * @author john 2021/3/11
 */
public class NumberOfStepsToReduceANumberToZero {
  class Solution {
    public int numberOfSteps (int num) {
      var ans = 0;
      while (num != 0) {
        num = (num & 1) == 0 ? num >>> 1 : num - 1;
        ans++;
      }
      return ans;
    }
  }
}