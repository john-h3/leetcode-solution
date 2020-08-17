package easy.string.repeatedstringmatch;

/**
 * RepeatedStringMatch
 *
 * @author john 2020/8/13
 */
public class RepeatedStringMatch {
    class Solution {
        public int repeatedStringMatch(String A, String B) {
            if (B.length() >= A.length() * 2) {
                int startIdx = B.indexOf(A);
                if (startIdx != -1) {
                    String prevStr = B.substring(0, startIdx);
                    int repeat = 0;
                    while (B.indexOf(A, startIdx) != -1) {
                        startIdx += A.length();
                        repeat++;
                    }
                    String afterStr = B.substring(startIdx);
                    if (A.contains(prevStr) && A.contains(afterStr)) {
                        return repeat + (prevStr.isEmpty() ? 0 : 1) + (afterStr.isEmpty() ? 0 : 1);
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            } else {
                int repeat = 1;
                StringBuilder tmp = new StringBuilder(A);
                while (repeat <= 3) {
                    if (tmp.toString().contains(B)) {
                        return repeat;
                    } else {
                        repeat++;
                        tmp.append(A);
                    }
                }
                return -1;
            }
        }
    }
}