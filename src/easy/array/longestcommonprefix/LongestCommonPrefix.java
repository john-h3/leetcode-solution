package easy.array.longestcommonprefix;

/**
 * LongestCommonPrefix
 *
 * @author john 2020/8/8
 */
public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            StringBuilder builder = new StringBuilder();
            String base = strs[0];
            outer:
            for (int i = 0; i < base.length(); i++) {
                char ch = base.charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (i == strs[j].length() || ch != strs[j].charAt(i)) {
                        break outer;
                    }
                }
                builder.append(ch);
            }
            return builder.toString();
        }
    }
}