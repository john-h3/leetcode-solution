package easy.binarysearch.peakindexinamountainarray;

/**
 * PeakIndexInAMountainArray
 *
 * @author john 2021/2/24
 */
public class PeakIndexInAMountainArray {
  class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int low = 0, high = arr.length - 1;
      while (low <= high) {
        var mid = (low + high) >>> 1;
        if (mid == 0) mid = 1;
        if (mid == arr.length - 1) mid = arr.length - 2;
        var val = arr[mid];
        if (val > arr[mid - 1] && val > arr[mid + 1]) return mid;
        else if (val > arr[mid - 1]) low = mid + 1;
        else high = mid - 1;
      }
      return -1;
    }
  }
}
