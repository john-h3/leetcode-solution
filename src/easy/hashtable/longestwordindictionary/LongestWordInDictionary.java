package easy.hashtable.longestwordindictionary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * LongestWordInDictionary
 *
 * @author john 2021/2/12
 */
public class LongestWordInDictionary {
  class Solution {
    public String longestWord(String[] words) {
      Arrays.sort(words,Comparator.comparingInt(String::length));
      if(words[0].length() != 1) return "";
      var set = new HashSet<String>();
      for (String word : words) {
        if (word.length() == 1) set.add(word);
        else if (set.contains(word.substring(0, word.length() - 1))) set.add(word);
      }
      var result = words[0];
      var length = 1;
      for (String word : words) {
        if (set.contains(word.substring(0, word.length() - 1))) {
          if (word.length() > length) {
            length = word.length();
            result = word;
          } else if (word.length() == length) {
            result = result.compareTo(word) > 0 ? word : result;
          }
        }
      }
      return result;
    }
  }
}
