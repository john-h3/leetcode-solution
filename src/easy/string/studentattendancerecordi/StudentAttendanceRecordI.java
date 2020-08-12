package easy.string.studentattendancerecordi;
/**
 * StudentAttendanceRecordI
 * 
 * @author john 2020/8/12
 */
public class StudentAttendanceRecordI {
    class Solution {
        public boolean checkRecord(String s) {
            int[] counter = new int[0x7f];
            char[] chars = s.toCharArray();
            char prevChar = ' ';
            for (char c : chars) {
                if (c == 'A' && counter[c] == 1) {
                    return false;
                }
                if (c == 'P' || c == 'A') {
                    if (prevChar != 'A') {
                        counter[prevChar] = 0;
                    }
                } else if (counter[c] == 2) {
                    return false;
                }
                counter[c]++;
                prevChar = c;
            }
            return true;
        }
    }
}