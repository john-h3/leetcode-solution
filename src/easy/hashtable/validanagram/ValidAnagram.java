package easy.hashtable.validanagram;

/**
 * ValidAnagram
 *
 * @author john 2021/2/7
 */
public class ValidAnagram {
  class Solution {
    public boolean isAnagram(String s, String t) {
      var table = new int[26];
      for (char c : s.toCharArray()) {
        table[c - 'a']++;
      }
      for (char c : t.toCharArray()) {
        table[c - 'a']--;
      }
      for (int i : table) {
        if (i != 0) return false;
      }
      return true;
    }
  }
}
