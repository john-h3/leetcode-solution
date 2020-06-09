package easy.array.xofakindinadeckofcards;

import java.util.*;

/**
 * XOfAKindInADeckOfCards
 *
 * @author john 2020/6/8
 */
public class XOfAKindInADeckOfCards {
    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            int[] map = new int[10001];
            for (int i : deck) {
                map[i]++;
            }
            int gcd = 0;
            for (int i : map) {
                if (i == 1) {
                    return false;
                } else if (i > 1) {
                    gcd = i;
                }
            }
            for (int i : map) {
                if (i > 0) {
                    gcd = getGcd(gcd, i);
                }
            }
            return gcd >= 2;
        }

        private int getGcd(int n1, int n2) {
            int max = Math.max(n1, n2);
            int min = Math.min(n1, n2);
            if (max % min == 0) {
                return min;
            }
            return getGcd(min, max % min);
        }
    }
}