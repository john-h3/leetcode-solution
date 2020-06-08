package easy.array.faircandyswap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * FairCandySwap
 *
 * @author john 2020/6/8
 */
public class FairCandySwap {
    class Solution {
        public int[] fairCandySwap(int[] A, int[] B) {
            int aSum = 0;
            int bSum = 0;
            boolean[] bFlag = new boolean[100001];
            for (int v : A) {
                aSum += v;
            }
            for (int v : B) {
                bSum += v;
                bFlag[v] = true;
            }
            int diff = (bSum - aSum) / 2;
            for (int v : A) {
                if (v + diff > 0 && v + diff < bFlag.length && bFlag[v + diff]) {
                    return new int[]{v, v + diff};
                }
            }
            return new int[]{0, 0};
        }
    }
}