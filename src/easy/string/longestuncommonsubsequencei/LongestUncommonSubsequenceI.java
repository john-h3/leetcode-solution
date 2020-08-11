package easy.string.longestuncommonsubsequencei;

/**
 * LongestUncommonSubsequenceI
 * 
 * @author john 2020/8/11
 */
public class LongestUncommonSubsequenceI {
    class Solution {
        public int findLUSlength(String a, String b) {
            if (a.length() != b.length()) {
                return Math.max(a.length(), b.length());
            } else {
                if (a.equals(b)) {
                    return -1;
                }
                return a.length();
            }
        }
    }
}