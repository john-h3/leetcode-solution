package easy.string.compressstringlcci;

/**
 * CompressStringLcci
 * 
 * @author john 2020/8/18
 */
public class CompressStringLcci {
    class Solution {
        public String compressString(String S) {
            if (S.isEmpty()) {
                return S;
            }
            StringBuilder builder = new StringBuilder();
            char[] chars = S.toCharArray();
            int count = 1;
            char prevChar = chars[0];
            for (int i = 1; i < chars.length; i++) {
                char c = chars[i];
                if (prevChar != c) {
                    builder.append(prevChar).append(count);
                    prevChar = c;
                    count = 1;
                } else {
                    count++;
                }
            }
            builder.append(prevChar).append(count);
            return builder.length() >= S.length() ? S : builder.toString();
        }
    }
}