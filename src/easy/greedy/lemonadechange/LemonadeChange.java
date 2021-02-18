package easy.greedy.lemonadechange;

/**
 * LemonadeChange
 *
 * @author john 2021/2/18
 */
public class LemonadeChange {
  class Solution {
    public boolean lemonadeChange(int[] bills) {
      var cashes = new int[2];
      for (int bill : bills) {
        switch (bill) {
          case 5:
            cashes[0]++;
            break;
          case 10:
            if (cashes[0] == 0) return false;
            cashes[0]--;
            cashes[1]++;
            break;
          case 20:
            if (cashes[0] > 0 && cashes[1] > 0) {
              cashes[0]--;
              cashes[1]--;
            } else if (cashes[0] > 3) cashes[0] -= 3;
            else return false;
        }
      }
      return true;
    }
  }
}
