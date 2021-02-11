package easy.hashtable.findthedifference;

/**
 * FindTheDifference
 *
 * @author john 2021/2/9
 */
public class FindTheDifference {
  class Solution {
    public char findTheDifference(String s, String t) {
      var table = new int[26];
      for (char c : s.toCharArray()) {
        table[c - 'a']++;
      }
      for (char c : t.toCharArray()) {
        table[c - 'a']--;
      }
      for (int i = 0; i < table.length; i++) {
        if (table[i] < 0) return (char) ('a'+i);
      }
      throw new IllegalArgumentException();
    }
  }
}