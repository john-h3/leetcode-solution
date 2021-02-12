package easy.depthfirstsearch.twosum;

import java.util.HashMap;

/**
 * TwoSum
 *
 * @author john 2021/2/12
 */
public class TwoSum {
  class Solution {
    public int[] twoSum(int[] nums, int target) {
      var map = new HashMap<Integer, Integer>();
      for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) return new int[] {i, map.get(target - nums[i])};
        else map.put(nums[i], i);
      }
      throw new IllegalArgumentException();
    }
  }
}
