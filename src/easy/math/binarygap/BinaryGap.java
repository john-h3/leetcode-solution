package easy.math.binarygap;

import java.util.List;

/**
 * BinaryGap
 *
 * @author john 2021/1/13
 */
public class BinaryGap {
  class Solution {
    public int binaryGap(int n) {
      String binaryStr = Integer.toString(n, 2);
      char[] chars = binaryStr.toCharArray();
      int count = 0;
      for (char c : chars) {
        if (c == '1') {
          count++;
        }
      }
      if (count <= 1) {
        return 0;
      }
      int[] idxList = new int[count];
      int idx = 0;
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] == '1') {
          idxList[idx++] = i;
        }
      }
      int max = 0;
      for (int i = 1; i < idxList.length; i++) {
        int gap = idxList[i] - idxList[i - 1];
        if (gap > max) {
          max = gap;
        }
      }
      return max;
    }
  }
}
