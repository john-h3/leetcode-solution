package easy.sort.sortintegersbythenumberof1bits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * SortIntegersByTheNumberOf1Bits
 *
 * @author john 2021/2/27
 */
public class SortIntegersByTheNumberOf1Bits {
  class Solution {
    public int[] sortByBits(int[] arr) {
      Arrays.sort(arr);
      List<Integer>[] li = new List[33];
      for (int i = 0; i < li.length; i++) {
        li[i] = new ArrayList<>();
      }
      for (int num : arr) {
        li[countBitOne(num)].add(num);
      }
      var start = 0;
      for (List<Integer> ints : li) {
        for (int i = 0; i < ints.size(); i++, start++) {
          arr[start] = ints.get(i);
        }
      }
      return arr;
    }

    private int countBitOne(int num) {
      var count = 0;
      for (int i = 0; i < 32; i++) {
        if (((num >>> i) & 1) == 1) count++;
      }
      return count;
    }
  }
}
