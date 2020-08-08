package easy.array.implementstrstr;

/**
 * ImplementStrstr
 *
 * @author john 2020/8/8
 */
public class ImplementStrstr {
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.isEmpty()) {
                return 0;
            }
            if (haystack.length() < needle.length()) {
                return -1;
            }
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                boolean check = true;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    return i;
                }
            }
            return -1;
        }
    }
}