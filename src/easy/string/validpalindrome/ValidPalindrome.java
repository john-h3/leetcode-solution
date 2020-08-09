package easy.string.validpalindrome;

/**
 * ValidPalindrome
 *
 * @author john 2020/8/9
 */
public class ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.isEmpty()) {
                return true;
            }
            int p1 = 0;
            int p2 = s.length() - 1;
            while (p1 < p2) {
                char c1 = s.charAt(p1);
                if (c1 >= 97 && c1 < 123) {
                    c1 = (char) (c1 - 32);
                }
                if ((c1 >= 65 && c1 < 91) || (c1 >= 48 && c1 < 58)) {
                    char c2 = s.charAt(p2);
                    if (c2 >= 97 && c2 < 123) {
                        c2 = (char) (c2 - 32);
                    }
                    if ((c2 >= 65 && c2 < 91) || (c2 >= 48 && c2 < 58)) {
                        if (c1 != c2) {
                            return false;
                        }
                        p1++;
                        p2--;
                    } else {
                        p2--;
                    }
                } else {
                    p1++;
                }
            }
            return true;
        }
    }
}