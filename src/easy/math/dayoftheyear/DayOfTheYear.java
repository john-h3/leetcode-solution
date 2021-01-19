package easy.math.dayoftheyear;
/**
 * DayOfTheYear
 *
 * @author john 2021/1/19
 */
public class DayOfTheYear {
  class Solution {
    public int dayOfYear(String date) {
      var year = Integer.parseInt(date.substring(0, 4));
      var month = Integer.parseInt(date.substring(5, 7));
      var day = Integer.parseInt(date.substring(8));
      return getDaysBefore(month) + day + (month > 2 && checkLeap(year) ? 1 : 0);
    }

    private boolean checkLeap(int year) {
      return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private int getDaysBefore(int month) {
      int count = 0;
      switch (month) {
        case 12:
          count += 30;
        case 11:
          count += 31;
        case 10:
          count += 30;
        case 9:
          count += 31;
        case 8:
          count += 31;
        case 7:
          count += 30;
        case 6:
          count += 31;
        case 5:
          count += 30;
        case 4:
          count += 31;
        case 3:
          count += 28;
        case 2:
          count += 31;
      }
      return count;
    }
  }
}
