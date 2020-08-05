package easy.array.thekweakestrowsinamatrix;

import java.util.*;

/**
 * TheKWeakestRowsInAMatrix
 *
 * @author john 2020/8/5
 */
public class TheKWeakestRowsInAMatrix {
    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int[] sums = new int[mat.length];
            for (int i = 0; i < mat.length; i++) {
                for (int n : mat[i]) {
                    sums[i] += n;
                }
                sums[i] = sums[i] * 100 + i;
            }
            Arrays.sort(sums);
            int[] answer = new int[k];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = sums[i] % 100;
            }
            return answer;
        }
    }
}