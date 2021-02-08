package easy.hashtable.intersectionoftwoarraysii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * IntersectionOfTwoArraysIi
 *
 * @author john 2021/2/8
 */
public class IntersectionOfTwoArraysIi {
  class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      var map = new HashMap<Integer, Integer>();
      for (int i : nums1) {
        map.merge(i, 1, Integer::sum);
      }
      var li = new ArrayList<Integer>();
      for (int i : nums2) {
        var c = map.get(i);
        if (c != null && c > 0) {
          li.add(i);
          map.merge(i, -1, Integer::sum);
        }
      }
      return li.stream().mapToInt(Integer::intValue).toArray();
    }
  }
}
