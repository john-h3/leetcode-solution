package easy.array.binaryprefixdivisibleby5;

import java.util.ArrayList;
import java.util.List;

/**
 * BinaryPrefixDivisibleBy5
 *
 * @author john 2020/6/12
 */
public class BinaryPrefixDivisibleBy5 {
    class Solution {
        public List<Boolean> prefixesDivBy5(int[] A) {
            List<Boolean> answer = new ArrayList<>(A.length);
            answer.add(A[0] == 0);
            int l = A[0];
            for (int i = 1; i < A.length; i++) {
                l = (l * 2 + A[i]) % 5;
                answer.add(l == 0);
            }
            return answer;
        }
    }
}