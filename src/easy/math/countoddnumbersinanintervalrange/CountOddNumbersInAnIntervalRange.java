package easy.math.countoddnumbersinanintervalrange;

/**
 * CountOddNumbersInAnIntervalRange
 *
 * @author john 2021/1/21
 */
public class CountOddNumbersInAnIntervalRange {
  class Solution {
    public int countOdds(int low, int high) {
      return countOddsLessEqualsThanN(high) - countOddsLessThanN(low);
    }

    private int countOddsLessThanN(int N) {
      return N / 2;
    }

    private int countOddsLessEqualsThanN(int N) {
      return (N + 1) / 2;
    }
  }
}
