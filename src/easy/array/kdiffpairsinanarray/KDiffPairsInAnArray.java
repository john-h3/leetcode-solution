package easy.array.kdiffpairsinanarray;

import java.util.HashMap;
import java.util.HashSet;

/**
 * KDiffPairsInAnArray
 *
 * @author john 2020/5/25
 */
public class KDiffPairsInAnArray {
    class Solution {
        public int findPairs(int[] nums, int k) {
            if (k < 0) {
                return 0;
            }
            if (k == 0) {
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int num : nums) {
                    map.merge(num, 1, Integer::sum);
                }
                int count = 0;
                for (Integer v : map.values()) {
                    if (v > 1) {
                        count++;
                    }
                }
                return count;
            }
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            int count = 0;
            for (Integer i : set) {
                if (set.contains(i + k)) {
                    count++;
                }
            }
            return count;
        }
    }
}