package easy.string.reversewordsinastringiii;
/**
 * ReverseWordsInAStringIii
 * 
 * @author john 2020/8/12
 */
public class ReverseWordsInAStringIii {
    class Solution {
        public String reverseWords(String s) {
            char[] chars = s.toCharArray();
            int startIdx = 0;
            int endIdx;
            while ((endIdx = s.indexOf(' ', startIdx)) != -1) {
                int newStartIdx = endIdx + 1;
                endIdx--;
                while (startIdx < endIdx) {
                    char c = chars[startIdx];
                    chars[startIdx] = chars[endIdx];
                    chars[endIdx] = c;
                    startIdx++;
                    endIdx--;
                }
                startIdx = newStartIdx;
            }
            endIdx = chars.length - 1;
            while (startIdx < endIdx) {
                char c = chars[startIdx];
                chars[startIdx] = chars[endIdx];
                chars[endIdx] = c;
                startIdx++;
                endIdx--;
            }
            return new String(chars);
        }
    }
}