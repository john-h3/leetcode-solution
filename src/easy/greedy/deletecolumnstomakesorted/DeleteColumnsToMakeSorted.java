package easy.greedy.deletecolumnstomakesorted;

import java.util.Arrays;

/**
 * DeleteColumnsToMakeSorted
 *
 * @author john 2021/2/19
 */
public class DeleteColumnsToMakeSorted {
  class Solution {
    public int minDeletionSize(String[] strs) {
      var charArrArr = new char[strs.length][strs[0].length()];
      for (int i = 0; i < strs.length; i++) {
        charArrArr[i] = strs[i].toCharArray();
      }
      var delCount = 0;
      for (int i = 0; i < charArrArr[0].length; i++) {
        var ch = charArrArr[0][i];
        for (int j = 0; j < charArrArr.length; j++) {
          if (charArrArr[j][i] < ch) {
            delCount++;
            break;
          }
          ch = charArrArr[j][i];
        }
      }
      return delCount;
    }
  }

  public static void main(String[] args) {}
}
