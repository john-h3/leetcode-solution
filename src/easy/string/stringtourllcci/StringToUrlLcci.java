package easy.string.stringtourllcci;

/**
 * StringToUrlLcci
 * 
 * @author john 2020/8/18
 */
public class StringToUrlLcci {
    class Solution {
        public String replaceSpaces(String S, int length) {
            StringBuilder builder = new StringBuilder();
            char[] chars = S.toCharArray();
            int startIdx = 0;
            int len = 0;
            for (int i = 0; i < length; i++) {
                if (chars[i] == ' ') {
                    if (len > 0) {
                        builder.append(chars, startIdx, len);
                        len = 0;
                    }
                    builder.append("%20");
                    startIdx = i + 1;
                } else {
                    len++;
                }
            }
            if (len > 0) {
                builder.append(chars, startIdx, len);
            }
            return builder.toString();
        }
    }
}