package easy.math.maximumproductofthreenumbers;

/**
 * MaximumProductOfThreeNumbers
 *
 * @author john 2021/1/11
 */
public class MaximumProductOfThreeNumbers {
  class Solution {
    int[] minHeap = new int[2];
    int[] maxHeap = new int[3];

    public int maximumProduct(int[] nums) {
      int[] table = new int[2001];
      for (int num : nums) {
        table[num + 1000]++;
      }
      for (int i = 0, idx = 0; i < table.length; i++) {
        if (table[i] > 0) {
          for (int c = table[i]; c > 0 && idx < 2; c--) {
            minHeap[idx++] = i - 1000;
          }
          if (idx == 2) {
            break;
          }
        }
      }
      for (int i = table.length - 1, idx = 0; i >= 0; i--) {
        if (table[i] > 0) {
          for (int c = table[i]; c > 0 && idx < 3; c--) {
            maxHeap[idx++] = i - 1000;
          }
          if (idx == 3) {
            break;
          }
        }
      }
      return Math.max(maxHeap[0] * maxHeap[1] * maxHeap[2], minHeap[0] * minHeap[1] * maxHeap[0]);
    }
  }
}
