package easy.hashtable.kthmissingpositivenumber;
/**
 * KthMissingPositiveNumber
 *
 * @author john 2021/2/14
 */
public class KthMissingPositiveNumber {
  class Solution {
    public int findKthPositive(int[] arr, int k) {
      var n = 0;
      var idx = 0;
      while (k > 0) {
        if (idx < arr.length) {
          if (++n != arr[idx]) k--;
          else idx++;
        } else {
          n += k;
          break;
        }
      }
      return n;
    }
  }
}
