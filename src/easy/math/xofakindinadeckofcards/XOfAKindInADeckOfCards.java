package easy.math.xofakindinadeckofcards;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * XOfAKindInADeckOfCards
 *
 * @author john 2021/1/16
 */
public class XOfAKindInADeckOfCards {
  class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
      var table = new int[10001];
      for (int i : deck) {
        table[i]++;
      }
      table = Arrays.stream(table).filter(i->i!=0).toArray();
      int min = 10000;
      for (int i : table) {
        if (i == 1) {
          return false;
        } else if (i >= 2) {
          min = Math.min(min, i);
        }
      }
      Set<Integer> factors = new HashSet<>();
      for (int i = 2; i <= min; i++) {
        if (min % i == 0) factors.add(i);
      }
      for (Integer factor : factors) {
        for (int i = 0; i < table.length; i++) {
          if (table[i] % factor == 0) {
            if (i == table.length - 1) return true;
          } else {
            break;
          }
        }
      }
      return false;
    }
  }
}
