package easy.string.decryptstringfromalphabettointegermapping;

/**
 * DecryptStringFromAlphabetToIntegerMapping
 *
 * @author john 2020/8/17
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    class Solution {
        public String reformat(String s) {
            int digitCount = 0;
            int alphaCount = 0;
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c >= 'a' && c <= 'z') {
                    alphaCount++;
                } else {
                    digitCount++;
                }
            }
            if (Math.abs(digitCount - alphaCount) > 1) {
                return "";
            }
            char[] newString = new char[s.length()];
            int alphaIdx, digitIdx;
            if (digitCount > alphaCount) {
                digitIdx = 0;
                alphaIdx = 1;
            } else {
                alphaIdx = 0;
                digitIdx = 1;
            }
            for (char c : chars) {
                if (c >= 'a' && c <= 'z') {
                    newString[alphaIdx] = c;
                    alphaIdx += 2;
                } else {
                    newString[digitIdx] = c;
                    digitIdx += 2;
                }
            }
            return new String(newString);
        }
    }
}