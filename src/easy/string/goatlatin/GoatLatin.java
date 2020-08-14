package easy.string.goatlatin;

/**
 * GoatLatin
 *
 * @author john 2020/8/14
 */
public class GoatLatin {
    class Solution {
        public String toGoatLatin(String S) {
            String[] words = S.split(" ");
            StringBuilder builder = new StringBuilder();
            int idx = 1;
            for (String word : words) {
                char firstChar = word.charAt(0);
                if (firstChar == 'a' || firstChar == 'A' ||
                        firstChar == 'e' || firstChar == 'E' ||
                        firstChar == 'i' || firstChar == 'I' ||
                        firstChar == 'o' || firstChar == 'O' ||
                        firstChar == 'u' || firstChar == 'U') {
                    builder.append(word);
                } else {
                    if (word.length() > 1) {
                        builder.append(word.substring(1)).append(word.charAt(0));
                    } else {
                        builder.append(word);
                    }
                }
                builder.append("ma");
                for (int i = 0; i < idx; i++) {
                    builder.append('a');
                }
                builder.append(' ');
                idx++;
            }
            return builder.substring(0, builder.length() - 1);
        }
    }
}