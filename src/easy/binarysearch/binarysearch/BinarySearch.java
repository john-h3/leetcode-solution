package easy.binarysearch.binarysearch;

import java.util.Arrays;

/**
 * BinarySearch
 *
 * @author john 2021/2/23
 */
public class BinarySearch {
  class Solution {
    public int search(int[] nums, int target) {
//      return Arrays.binarySearch(nums, target);
      var start = 0;
      var end = nums.length - 1;
      int mid;
      while (nums[mid = start + (end - start) / 2] != target) {
        if (nums[mid] > target) end = mid - 1;
        else start = mid + 1;
        if (start > end) return -1;
      }
      return mid;
    }
  }
}