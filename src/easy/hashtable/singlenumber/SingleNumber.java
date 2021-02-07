package easy.hashtable.singlenumber;

import java.util.Arrays;
import java.util.HashMap;

/**
 * SingleNumber
 *
 * @author john 2021/2/7
 */
public class SingleNumber {
  class Solution {
    public int singleNumber(int[] nums) {
      var map = new HashMap<Integer, Integer>();
      Arrays.stream(nums).forEach(e -> map.merge(e, 1, Integer::sum));
      for (Integer num : map.keySet()) {
        if (map.get(num) == 1) return num;
      }
      throw new IllegalArgumentException();
    }
  }
}
