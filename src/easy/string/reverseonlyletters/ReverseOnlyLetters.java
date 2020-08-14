package easy.string.reverseonlyletters;

/**
 * ReverseOnlyLetters
 * 
 * @author john 2020/8/15
 */
public class ReverseOnlyLetters {
    class Solution {
        public String reverseOnlyLetters(String S) {
            char[] chars = S.toCharArray();
            int idx = 0;
            for (int i = S.length() - 1; i >= 0; i--) {
                char c = S.charAt(i);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    while (!(chars[idx] >= 'a' && chars[idx] <= 'z') && !(chars[idx] >= 'A' && chars[idx] <= 'Z')) {
                        idx++;
                    }
                    chars[idx++] = c;
                }
            }
            return new String(chars);
        }
    }
}