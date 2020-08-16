package easy.string.decryptstringfromalphabettointegermapping;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * DecryptStringFromAlphabetToIntegerMapping
 *
 * @author john 2020/8/16
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    class Solution {
        public String freqAlphabets(String s) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 2) {
                    if (s.charAt(i + 2) == '#') {
                        char a = s.charAt(i);
                        char b = s.charAt(i + 1);
                        builder.append((char) ('j' + (a - '1') * 10 + b - '0'));
                        i += 2;
                        continue;
                    }
                }
                builder.append((char) (s.charAt(i) - '1' + 'a'));
            }
            return builder.toString();
        }
    }
}