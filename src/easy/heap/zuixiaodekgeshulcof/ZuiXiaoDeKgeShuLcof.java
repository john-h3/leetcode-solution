package easy.heap.zuixiaodekgeshulcof;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ZuiXiaoDeKgeShuLcof
 *
 * @author john 2021/3/27
 */
public class ZuiXiaoDeKgeShuLcof {
  class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
      if (k == 0) return new int[0];
      var heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
      for (int n : arr) {
          if (heap.size() < k) heap.add(n);
          else if (heap.peek() > n) {
            heap.poll();
            heap.add(n);
          }
      }
      return heap.stream().mapToInt(Integer::intValue).toArray();
    }
  }
}
