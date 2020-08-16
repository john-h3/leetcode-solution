package easy.string.maximumnumberofballoons;

import java.util.Arrays;

/**
 * MaximumNumberOfBalloons
 *
 * @author john 2020/8/16
 */
public class MaximumNumberOfBalloons {
    class Solution {
        public int maxNumberOfBalloons(String text) {
            int[] counter = new int[26];
            for (int i = 0; i < text.length(); i++) {
                counter[text.charAt(i) - 'a']++;
            }
            int min = text.length();
            for (int i = 0; i < counter.length; i++) {
                int c;
                switch (i + 'a') {
                    case 'b':
                    case 'a':
                    case 'n':
                        min = Math.min(min, counter[i]);
                        break;
                    case 'l':
                    case 'o':
                        min = Math.min(counter[i] / 2, min);
                        break;
                    default:
                }
            }
            return min;
        }
    }
}