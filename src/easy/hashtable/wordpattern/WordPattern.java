package easy.hashtable.wordpattern;

import java.util.HashMap;

/**
 * WordPattern
 *
 * @author john 2021/2/8
 */
public class WordPattern {
  class Solution {
    public boolean wordPattern(String pattern, String s) {
      String[] words = s.split(" ");
      char[] chars = pattern.toCharArray();
      var map1 = new HashMap<Character, String>();
      var map2 = new HashMap<String, Character>();
      if (words.length != chars.length) return false;
      for (int i = 0; i < chars.length; i++) {
        if (map1.containsKey(chars[i]) && map2.containsKey(words[i])) {
          if (!map1.get(chars[i]).equals(words[i]) || !map2.get(words[i]).equals(chars[i])) {
            return false;
          }
        } else if (map1.containsKey(chars[i]) || map2.containsKey(words[i])) {
          return false;
        } else {
          map1.put(chars[i], words[i]);
          map2.put(words[i], chars[i]);
        }
      }
      return true;
    }
  }
}
