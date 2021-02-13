package easy.hashtable.nrepeatedelementinsize2narray;

import java.util.Arrays;
import java.util.HashMap;

/**
 * NRepeatedElementInSize2nArray
 *
 * @author john 2021/2/13
 */
public class NRepeatedElementInSize2nArray {
  class Solution {
    public int repeatedNTimes(int[] A) {
      var map = new HashMap<Integer, Integer>();
      Arrays.stream(A).forEach(e -> map.merge(e, 1, Integer::sum));
      for (Integer k : map.keySet()) {
        if (map.get(k) == A.length / 2) return k;
      }
      throw new IllegalArgumentException();
    }
  }
}
