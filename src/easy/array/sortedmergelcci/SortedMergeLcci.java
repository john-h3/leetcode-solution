package easy.array.sortedmergelcci;

import java.util.Arrays;

/**
 * SortedMergeLcci
 *
 * @author john 2020/8/8
 */
public class SortedMergeLcci {
    class Solution {
        public void merge(int[] A, int m, int[] B, int n) {
            if (n == 0) {
                return;
            }
            int[] tmp = new int[m];
            System.arraycopy(A, 0, tmp, 0, m);
            int aIdx = 0;
            int bIdx = 0;
            for (int i = 0; i < m + n; i++) {
                if (bIdx == n || (aIdx < m && tmp[aIdx] <= B[bIdx])) {
                    A[i] = tmp[aIdx++];
                } else {
                    A[i] = B[bIdx++];
                }
            }
        }
    }
}