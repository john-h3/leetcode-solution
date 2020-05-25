package easy.array.reshapethematrix;

import java.util.Arrays;

/**
 * ReshapeTheMatrix
 *
 * @author john 2020/5/25
 */
public class ReshapeTheMatrix {
    class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int count = 0;
            for (int[] arr : nums) {
                count += arr.length;
            }
            if (count != r * c) {
                return nums;
            }
            int[][] newMatrix = new int[r][c];
            int cr = 0;
            int cc = 0;
            for (int[] arr : nums) {
                for (int i : arr) {
                    newMatrix[cr][cc++] = i;
                    if (cc == c) {
                        cr++;
                        cc = 0;
                    }
                }
            }
            return newMatrix;
        }
    }
}