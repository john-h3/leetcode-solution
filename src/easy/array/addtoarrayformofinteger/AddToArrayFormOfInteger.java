package easy.array.addtoarrayformofinteger;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * AddToArrayFormOfInteger
 *
 * @author john 2020/6/10
 */
public class AddToArrayFormOfInteger {
    class Solution {
        public List<Integer> addToArrayForm(int[] A, int K) {
            String kStr = String.valueOf(K);
            int[] k;
            if (A.length < kStr.length()) {
                k = new int[kStr.length()];
                for (int i = 0; i < kStr.length(); i++) {
                    k[i] = kStr.charAt(i) - 48;
                }
                int[] newA = new int[kStr.length()];
                System.arraycopy(A, 0, newA, kStr.length() - A.length, A.length);
                A = newA;
            } else {
                k = new int[A.length];
                for (int i = 0; i < kStr.length(); i++) {
                    k[A.length - kStr.length() + i] = kStr.charAt(i) - 48;
                }
            }
            boolean b = false;
            for (int i = A.length - 1; i >= 0; i--) {
                A[i] += k[i];
                if (A[i] > 9) {
                    A[i] -= 10;
                    if (i == 0) {
                        b = true;
                    } else {
                        A[i - 1] += 1;
                    }
                }
            }
            List<Integer> result = new ArrayList<>();
            if (b) {
                result.add(1);
            }
            for (int n : A) {
                result.add(n);
            }
            return result;
        }
    }
}