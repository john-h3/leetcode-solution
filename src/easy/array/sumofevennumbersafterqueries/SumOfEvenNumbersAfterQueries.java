package easy.array.sumofevennumbersafterqueries;
/**
 * SumOfEvenNumbersAfterQueries
 * 
 * @author john 2020/6/10
 */
public class SumOfEvenNumbersAfterQueries {
    class Solution {
        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
            int[] answer = new int[queries.length];
            int evenSum = 0;
            for (int v : A) {
                if ((v & 1) == 0) {
                    evenSum += v;
                }
            }
            for (int i = 0; i < queries.length; i++) {
                int idx = queries[i][1];
                int oldVal = A[idx];
                A[idx] += queries[i][0];
                boolean isNewEven = (A[idx] & 1) == 0;
                if ((oldVal & 1) == 0) {
                    if (isNewEven) {
                        evenSum += A[idx] - oldVal;
                    } else {
                        evenSum -= oldVal;
                    }
                } else {
                    if (isNewEven) {
                        evenSum += A[idx];
                    }
                }
                answer[i] = evenSum;
            }
            return answer;
        }
    }
}