package easy.greedy.minimumchangestomakealternatingbinarystring;

/**
 * MinimumChangesToMakeAlternatingBinaryString
 *
 * @author john 2021/2/22
 */
public class MinimumChangesToMakeAlternatingBinaryString {
  class Solution {
    public int minOperations(String s) {
      var sum = 0;
      var b = true;
      var chars = s.toCharArray();
      for (char ch : chars) {
        if (ch == (b ? '0' : '1')) sum++;
        b = !b;
      }
      var min = sum;
      sum = 0;
      b = false;
      for (char ch : chars) {
        if (ch == (b ? '0' : '1')) sum++;
        b = !b;
      }
      return Math.min(min, sum);
    }
  }
}