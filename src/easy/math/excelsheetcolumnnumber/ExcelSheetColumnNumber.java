package easy.math.excelsheetcolumnnumber;

/**
 * ExcelSheetColumnNumber
 *
 * @author john 2021/1/6
 */
public class ExcelSheetColumnNumber {
  class Solution {
    public int titleToNumber(String s) {
      int base = 1;
      int sum = 0;
      char[] chars = s.toCharArray();
      for (int i = chars.length - 1; i >= 0; i--) {
        sum += base * (chars[i] - '@');
        base *= 26;
      }
      return sum;
    }
  }
}
