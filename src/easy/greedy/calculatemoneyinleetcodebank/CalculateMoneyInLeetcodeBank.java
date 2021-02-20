package easy.greedy.calculatemoneyinleetcodebank;

/**
 * CalculateMoneyInLeetcodeBank
 *
 * @author john 2021/2/20
 */
public class CalculateMoneyInLeetcodeBank {
  class Solution {
    public int totalMoney(int n) {
      var week = n  / 7;
      var sum = 21 * week + (week > 0 ? (1 + week) * week * 7 / 2 : 0);
      return sum + (n % 7 > 0 ? ((week + 1) * 2 + (n % 7 - 1)) * (n % 7) / 2 : 0);
    }
  }

  public static void main(String[] args) {
    new CalculateMoneyInLeetcodeBank().new Solution().totalMoney(7);
  }
}