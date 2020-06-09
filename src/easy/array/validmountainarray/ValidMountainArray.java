package easy.array.validmountainarray;

/**
 * ValidMountainArray
 *
 * @author john 2020/6/9
 */
public class ValidMountainArray {
    class Solution {
        public boolean validMountainArray(int[] A) {
            if (A.length < 3) {
                return false;
            }
            if (A[1] <= A[0]) {
                return false;
            }
            int sIdx = 1;
            while (sIdx < A.length && A[sIdx] > A[sIdx - 1]) {
                sIdx++;
            }
            int eIdx = A.length - 2;
            while (eIdx >= 0 && A[eIdx] > A[eIdx + 1]) {
                eIdx--;
            }
            if (sIdx == 1 || eIdx == A.length - 2) {
                return false;
            }
            return sIdx - 2 == eIdx;
        }
    }
}