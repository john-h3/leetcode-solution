package easy.math.excelsheetcolumntitle;

/**
 * ExcelSheetColumnTitle
 *
 * @author john 2021/1/5
 */
public class ExcelSheetColumnTitle {
  class Solution {
    public String convertToTitle(int n) {
      StringBuilder sb = new StringBuilder();
      char ch = 'A' - 1;
      while (n > 0) {
        if (n % 26 == 0) {
          sb.append('Z');
          n = n / 26 - 1;
        } else {
          sb.append((char) (ch + n % 26));
          n = n / 26;
        }
      }
      return sb.reverse().toString();
    }
  }
}
