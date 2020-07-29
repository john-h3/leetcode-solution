package easy.dynamicprogramming.issubsequence;

/**
 * IsSubsequence
 *
 * @author john 2020/6/29
 */
public class IsSubsequence {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            char[] tChars = t.toCharArray();
            char[] sChars = s.toCharArray();
            if (tChars.length == 0) {
                return sChars.length == 0;
            }
            if (sChars.length == 0) {
                return true;
            }
            int idx = 0;
            for (char sChar : sChars) {
                if (idx == tChars.length) {
                    return false;
                }
                while (sChar != tChars[idx++]) {
                    if (idx == tChars.length) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
