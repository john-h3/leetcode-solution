package easy.string.reversestringii;

/**
 * ReverseStringIi
 *
 * @author john 2020/8/11
 */
public class ReverseStringIi {
    class Solution {
        public String reverseStr(String s, int k) {
            if (s.length() < 2 || k == 1) {
                return s;
            }
            char[] newStr = s.toCharArray();
            boolean reverse = true;
            for (int i = 0; i < newStr.length; i += k) {
                if (reverse) {
                    int size = Math.min(k, newStr.length - i);
                    for (int j = 0; j < size; j++) {
                        newStr[i+j] = s.charAt(i + size - 1 - j);
                    }
                }
                reverse = !reverse;
            }
            return new String(newStr);
        }
    }
}