package easy.array.partitionarrayintothreepartswithequalsum;
/**
 * PartitionArrayIntoThreePartsWithEqualSum
 * 
 * @author john 2020/6/12
 */
public class PartitionArrayIntoThreePartsWithEqualSum {
    class Solution {
        public boolean canThreePartsEqualSum(int[] A) {
            int sum = 0;
            for (int v : A) {
                sum += v;
            }
            if (sum % 3 == 0) {
                int avg = sum / 3;
                int sum1 = 0;
                int idx1 = 0;
                for (; idx1 < A.length; idx1++) {
                    sum1 += A[idx1];
                    if (sum1 == avg) {
                        break;
                    }
                }
                if (sum1 != avg) {
                    return false;
                }
                int sum2 = 0;
                int idx2 = idx1 + 1;
                for (; idx2 < A.length; idx2++) {
                    sum2 += A[idx2];
                    if (sum2 == avg) {
                        break;
                    }
                }
                return sum2 == avg && idx2 < A.length - 1;
            } else {
                return false;
            }
        }
    }
}