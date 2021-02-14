package easy.hashtable.occurrencesafterbigram;

import java.util.ArrayList;

/**
 * OccurrencesAfterBigram
 *
 * @author john 2021/2/14
 */
public class OccurrencesAfterBigram {
  class Solution {
    public String[] findOcurrences(String text, String first, String second) {
      var words = text.split(" ");
      var li = new ArrayList<String>();
      for (int i = 0; i < words.length - 2; i++) {
        if (words[i].equals(first) && words[i + 1].equals(second)) li.add(words[i + 2]);
      }
      return li.toArray(String[]::new);
    }
  }
}
