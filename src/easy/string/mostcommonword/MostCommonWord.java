package easy.string.mostcommonword;

import java.util.*;

/**
 * MostCommonWord
 * 
 * @author john 2020/8/14
 */
public class MostCommonWord {
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            Set<String> banSet = new HashSet<>();
            Map<String, Integer> counter = new HashMap<>();
            Collections.addAll(banSet, banned);
            paragraph = paragraph.toLowerCase();

            char[] chars = paragraph.toCharArray();
            StringBuilder builder = new StringBuilder();
            String commonWord = null;
            int max = 0;
            for (char c : chars) {
                if (c >= 'A' && c <= 'Z') {
                    c += 32;
                }
                if (c >= 'a' && c <= 'z') {
                    builder.append(c);
                } else {
                    if (builder.length() > 0) {
                        String word = builder.toString();
                        if (!banSet.contains(word)) {
                            int count = counter.merge(word, 1, Integer::sum);
                            if (count > max) {
                                max = count;
                                commonWord = word;
                            }
                        }
                        builder.delete(0, builder.length());
                    }
                }
            }
            if (builder.length() > 0) {
                String word = builder.toString();
                if (!banSet.contains(word)) {
                    int count = counter.merge(word, 1, Integer::sum);
                    if (count > max) {
                        return word;
                    }
                }
            }
            return commonWord;
        }
    }
}