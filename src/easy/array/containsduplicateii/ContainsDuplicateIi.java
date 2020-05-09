package easy.array.containsduplicateii;

import java.util.HashMap;
import java.util.Map;

/**
 * ContainsDuplicateIi
 *
 * @author john 2020/5/9
 */
public class ContainsDuplicateIi {
    class Solution {
        private final Map<Integer, Integer> map = new HashMap<>(0x7ff);

        public boolean containsNearbyDuplicate(int[] nums, int k) {
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    Integer idx = map.get(nums[i]);
                    if (i - idx <= k) {
                        return true;
                    }
                }
                map.put(nums[i], i);
            }
            return false;
        }
    }
}