package easy.string.uniquemorsecodewords;

import java.util.HashSet;
import java.util.Set;

/**
 * UniqueMorseCodeWords
 *
 * @author john 2020/8/14
 */
public class UniqueMorseCodeWords {
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] passwords = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            Set<String> set = new HashSet<>();
            for (String word : words) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    builder.append(passwords[word.charAt(i) - 'a']);
                }
                set.add(builder.toString());
            }
            return set.size();
        }
    }
}