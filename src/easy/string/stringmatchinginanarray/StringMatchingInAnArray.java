package easy.string.stringmatchinginanarray;

import java.util.*;

/**
 * StringMatchingInAnArray
 * 
 * @author john 2020/8/17
 */
public class StringMatchingInAnArray {
    class Solution {
        public List<String> stringMatching(String[] words) {
            List<String> li = new ArrayList<>();
            String wholeStr = String.join(",", words);
            for (String word : words) {
                if (wholeStr.indexOf(word) != wholeStr.lastIndexOf(word)) {
                    li.add(word);
                }
            }
            return li;
        }
    }
}