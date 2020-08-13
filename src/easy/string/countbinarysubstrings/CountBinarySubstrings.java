package easy.string.countbinarysubstrings;

/**
 * CountBinarySubstrings
 *
 * @author john 2020/8/13
 */
public class CountBinarySubstrings {
    class Solution {
        public int countBinarySubstrings(String s) {
            int sum = 0;
            char[] chars = s.toCharArray();
            char prevChar = chars[0];
            int prevCount = 0;
            int currentCount = 0;
            for (char ch : chars) {
                if (ch == prevChar) {
                    currentCount++;
                } else {
                    sum += Math.min(prevCount, currentCount);
                    prevCount = currentCount;
                    currentCount = 1;
                    prevChar = ch;
                }
            }
            sum += Math.min(prevCount, currentCount);
            return sum;
        }
    }
}