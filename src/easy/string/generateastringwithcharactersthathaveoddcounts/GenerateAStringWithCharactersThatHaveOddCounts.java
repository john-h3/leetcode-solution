package easy.string.generateastringwithcharactersthathaveoddcounts;

/**
 * GenerateAStringWithCharactersThatHaveOddCounts
 *
 * @author john 2020/8/17
 */
public class GenerateAStringWithCharactersThatHaveOddCounts {
    class Solution {
        public String generateTheString(int n) {
            char[] chars = new char[n];
            for (int i = 0; i < chars.length - 1; i++) {
                chars[i] = 'a';
            }
            chars[chars.length - 1] = ((n & 1) == 0) ? 'b' : 'a';
            return new String(chars);
        }
    }
}