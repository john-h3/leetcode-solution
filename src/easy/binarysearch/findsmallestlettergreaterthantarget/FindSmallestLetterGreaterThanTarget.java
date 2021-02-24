package easy.binarysearch.findsmallestlettergreaterthantarget;

import java.util.Arrays;

/**
 * FindSmallestLetterGreaterThanTarget
 *
 * @author john 2021/2/24
 */
public class FindSmallestLetterGreaterThanTarget {
  class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      var idx = binarySearch(letters, target);
      if (idx >= 0) {
        return idx < letters.length - 1 ? letters[idx+1] : letters[0];
      }
      var insertionIdx = -idx - 1;
      if (insertionIdx > letters.length - 1) return letters[0];
      return letters[insertionIdx];
    }
    
    private int binarySearch(char[] arr, char target) {
      int low = 0, high = arr.length - 1;
      while (low <= high) {
        var mid = (low + high) >>> 1;
        var val = arr[mid];
        if (val > target) {
          high = mid - 1;
        } else if (val < target) {
          low = mid + 1;
        } else {
          // ensure get last target index
          if (mid < high && arr[mid + 1] == val) low = mid + 1;
          else return mid;
        }
      }
      return - (1 + low);
    }
  }

  public static void main(String[] args) {
  }
}
