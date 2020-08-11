package easy.string.repeatedsubstringpattern;

/**
 * RepeatedSubstringPattern
 *
 * @author john 2020/8/11
 */
public class RepeatedSubstringPattern {
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            if (s.length() == 1) {
                return false;
            }
            char[] chars = s.toCharArray();
            int bound;
            if ((s.length() & 1) == 1) {
                bound = s.length() / 3;
            } else {
                bound = s.length() / 2;
            }
            root:
            for (int i = 1; i <= bound; i++) {
                if (s.length() % i == 0) {
                    int count = s.length() / i;
                    for (int j = 1; j < count; j++) {
                        for (int k = 0; k < i; k++) {
                            if (chars[k] != chars[k + j * i]) {
                                continue root;
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }
}