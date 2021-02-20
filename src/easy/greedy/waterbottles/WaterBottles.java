package easy.greedy.waterbottles;

/**
 * WaterBottles
 *
 * @author john 2021/2/20
 */
public class WaterBottles {
  class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      var sum = numBottles;
      var ex = 0;
      while ((ex = numBottles / numExchange) > 0) {
        sum += ex;
        numBottles = numBottles % numExchange + ex;
      }
      return sum;
    }
  }

  public static void main(String[] args) {
    new WaterBottles().new Solution().numWaterBottles(9, 3);
  }
}