package easy.string.reformatdate;

import java.util.HashMap;
import java.util.Map;

/**
 * ReformatDate
 *
 * @author john 2020/8/18
 */
public class ReformatDate {
    class Solution {
        private String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        public String reformatDate(String date) {
            String[] dateArr = date.split(" ");
            String year = dateArr[2];
            String month = null;
            String day = dateArr[0].substring(0, dateArr[0].length() - 2);
            if (day.length() == 1) {
                day = "0" + day;
            }
            for (int i = 0; i < months.length; i++) {
                if (months[i].equals(dateArr[1])) {
                    if (i + 1 >= 10) {
                        month = String.valueOf(i + 1);
                    } else {
                        month = "0" + (i + 1);
                    }
                    break;
                }
            }
            return String.join("-", year, month, day);
        }
    }
}