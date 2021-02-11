package easy.hashtable.intersectionoftwoarrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * IntersectionOfTwoArrays
 *
 * @author john 2021/2/8
 */
public class IntersectionOfTwoArrays {
  class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      var set1 = new HashSet<Integer>();
      var set2 = new HashSet<Integer>();
      Arrays.stream(nums1).forEach(set1::add);
      Arrays.stream(nums2).forEach(set2::add);
      set1.retainAll(set2);
      return set1.stream().mapToInt(Integer::intValue).toArray();
    }
  }
}
