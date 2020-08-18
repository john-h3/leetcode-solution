package easy.string.consecutivecharacters;

/**
 * ConsecutiveCharacters
 * 
 * @author john 2020/8/18
 */
public class ConsecutiveCharacters {
    class Solution {
        public int maxPower(String s) {
            int max = 0;
            char prevChar = ' ';
            int prevCount = 0;
            for (char c : s.toCharArray()) {
                if (c == prevChar) {
                    prevCount++;
                } else {
                    max = Math.max(prevCount, max);
                    prevChar = c;
                    prevCount = 1;
                }
            }
            max = Math.max(prevCount, max);
            return max;
        }
    }
}