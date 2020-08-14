package easy.string.buddystrings;

/**
 * BuddyStrings
 *
 * @author john 2020/8/14
 */
public class BuddyStrings {
    class Solution {
        public boolean buddyStrings(String A, String B) {
            if (A.length() != B.length()) {
                return false;
            }
            int[] counterA = new int[26];
            int diff = 0;
            int flag = 0;
            for (int i = 0; i < A.length(); i++) {
                char chA = A.charAt(i);
                char chB = B.charAt(i);
                if (chA != chB) {
                    diff++;
                    flag += (chA - chB);
                    if (diff > 2) {
                        return false;
                    }
                }
                counterA[chA - 'a']++;
            }
            if (diff == 2) {
                return flag == 0;
            } else if (diff == 1) {
                return false;
            } else {
                for (int i : counterA) {
                    if (i >= 2) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}