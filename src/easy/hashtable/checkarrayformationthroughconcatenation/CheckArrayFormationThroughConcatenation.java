package easy.hashtable.checkarrayformationthroughconcatenation;

import java.util.Arrays;
import java.util.HashMap;

/**
 * CheckArrayFormationThroughConcatenation
 *
 * @author john 2021/2/15
 */
public class CheckArrayFormationThroughConcatenation {
  class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
      int p = 0;
      var map = new HashMap<Integer, int[]>();
      for (int[] piece : pieces) {
        map.put(piece[0], piece);
      }
      while (p <= arr.length - 1) {
        int[] piece = map.get(arr[p]);
        if (piece == null) return false;
        else if (arrEquals(arr, p, piece)) p += piece.length;
        else return false;
      }
      return true;
    }

    private boolean arrEquals(int[] arr1, int start, int[] arr2) {
      return Arrays.equals(arr1, start, start + arr2.length, arr2, 0, arr2.length);
    }
  }
}
