package easy.string.numberofsegmentsinastring;

/**
 * NumberOfSegmentsInAString
 * 
 * @author john 2020/8/10
 */
public class NumberOfSegmentsInAString {
    class Solution {
        public int countSegments(String s) {
            int count = 0;
            char[] chars = s.toCharArray();

            boolean flag = false;
            for (char c : chars) {
                if (c != ' ') {
                    if (!flag) {
                        count++;
                        flag = true;
                    }
                } else {
                    flag = false;
                }
            }

            return count;
        }
    }
}