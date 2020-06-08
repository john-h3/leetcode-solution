package easy.array.monotonicarray;

/**
 * MonotonicArray
 *
 * @author john 2020/6/8
 */
public class MonotonicArray {
    class Solution {
        public boolean isMonotonic(int[] A) {
            int trend = 0;
            int tmp = A[0];
            for (int value : A) {
                if (trend > 0) {
                    if (value < tmp) {
                        return false;
                    }
                } else if (trend < 0) {
                    if (value > tmp) {
                        return false;
                    }
                } else {
                    if (value < tmp) {
                        trend = -1;
                    } else if (value > tmp) {
                        trend = 1;
                    }
                }
                tmp = value;
            }
            return true;
        }
    }
}