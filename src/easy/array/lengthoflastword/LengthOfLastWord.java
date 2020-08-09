package easy.array.lengthoflastword;

/**
 * LengthOfLastWord
 *
 * @author john 2020/8/9
 */
public class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            int count = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    count++;
                } else if (count != 0) {
                    break;
                }
            }
            return count;
        }
    }
}