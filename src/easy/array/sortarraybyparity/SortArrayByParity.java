package easy.array.sortarraybyparity;

import java.util.Arrays;
import java.util.Comparator;

/**
 * SortArrayByParity
 * 
 * @author john 2020/6/8
 */
public class SortArrayByParity {
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            int idx = 0;
            int[] tmp = new int[A.length];
            int idx2 = 0;
            int[] tmp2 = new int[A.length];
            for (int i : A) {
                if ((i & 1) == 1) {
                    tmp[idx++] = i;
                } else {
                    tmp2[idx2++] = i;
                }
            }
            if (idx2 >= 0) {
                System.arraycopy(tmp2, 0, A, 0, idx2);
            }
            if (idx >= 0) {
                System.arraycopy(tmp, 0, A, idx2, idx);
            }
            return A;
        }
    }
}