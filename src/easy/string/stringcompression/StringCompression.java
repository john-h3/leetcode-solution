package easy.string.stringcompression;

/**
 * StringCompression
 * 
 * @author john 2020/8/10
 */
public class StringCompression {
    class Solution {
        public int compress(char[] chars) {
            StringBuilder builder = new StringBuilder();
            char tmp = chars[0];
            int count = 0;
            int idx = 0;
            for (char c : chars) {
                if (tmp == c) {
                    count++;
                } else {
                    chars[idx++] = tmp;
                    tmp = c;
                    if (count != 1) {
                        String s = String.valueOf(count);
                        System.arraycopy(s.toCharArray(), 0, chars, idx, s.length());
                        idx += s.length();
                        count = 1;
                    }
                }
            }
            chars[idx++] = tmp;
            if (count != 1) {
                String s = String.valueOf(count);
                System.arraycopy(s.toCharArray(), 0, chars, idx, s.length());
                idx += s.length();
            }
            return idx;
        }
    }
}