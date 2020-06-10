package easy.array.squaresofasortedarray;

import java.util.Arrays;

/**
 * SquaresOfASortedArray
 *
 * @author john 2020/6/10
 */
public class SquaresOfASortedArray {
    class Solution {
        public int[] sortedSquares(int[] A) {
            for (int i = 0; i < A.length; i++) {
                A[i] = A[i] * A[i];
            }
            Arrays.sort(A);
            return A;
        }
    }
}