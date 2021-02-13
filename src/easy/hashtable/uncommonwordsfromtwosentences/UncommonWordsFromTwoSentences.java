package easy.hashtable.uncommonwordsfromtwosentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 * UncommonWordsFromTwoSentences
 *
 * @author john 2021/2/13
 */
public class UncommonWordsFromTwoSentences {
  class Solution {
    public String[] uncommonFromSentences(String A, String B) {
      var map = new HashMap<String, Integer>();
      Consumer<String> stringConsumer =
          S -> {
            for (String s : S.split(" ")) {
              map.merge(s, 1, Integer::sum);
            }
          };
      stringConsumer.accept(A);
      stringConsumer.accept(B);
      return map.keySet().stream().filter(e -> map.get(e) == 1).toArray(String[]::new);
    }
  }
}
