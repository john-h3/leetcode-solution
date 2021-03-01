package easy.sort.sortarraybyincreasingfrequency;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * SortArrayByIncreasingFrequency
 *
 * @author john 2021/3/1
 */
public class SortArrayByIncreasingFrequency {
  class Solution {
    public int[] frequencySort(int[] nums) {
      var table = new int[201];
      for (int num : nums) {
        table[num + 100]++;
      }
      var li = new ArrayList<int[]>();
      for (int i = 0; i < table.length; i++) {
        if (table[i] > 0) li.add(new int[]{i - 100, table[i]});
      }
      li.sort(((o1, o2) -> {
        if (o1[1] == o2[1]) return o2[0] - o1[0];
        else return o1[1] - o2[1];
      }));
      var idx = 0;
      for (int[] ints : li) {
        for (int i = 0; i < ints[1]; i++) {
          nums[idx++] = ints[0];
        }
      }
      return nums;
    }
  }
}