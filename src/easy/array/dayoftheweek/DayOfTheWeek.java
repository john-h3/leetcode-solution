package easy.array.dayoftheweek;

import java.util.Calendar;

/**
 * DayOfTheWeek
 *
 * @author john 2020/6/24
 */
public class DayOfTheWeek {
    class Solution {
        private final String[] DAYS = {"Thursday" ,"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        private final int[] DAYS_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        public String dayOfTheWeek(int day, int month, int year) {
            int days = (year - 1971) * 365;
            for (int i = 0; i < month - 1; i++) {
                days += DAYS_OF_MONTH[i];
            }
            days += day;
            // fix 闰年
            for (int i = 1971; i < year; i++) {
                if (check(i)) {
                    days += 1;
                }
            }
            if (check(year) && month >= 3) {
                days += 1;
            }
            return DAYS[days % 7];
        }
        
        private boolean check (int year) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
    }
}